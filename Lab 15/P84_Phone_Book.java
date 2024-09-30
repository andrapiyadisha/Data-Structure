import java.util.*;

public class P84_Phone_Book {
    private class Node {
        String name;
        String phoneNumber;
        Node left, right;

        Node(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            left = right = null;
        }
    }

    static Node head = null;

    public void addEntry(String name, String phoneNumber){
        head = addEntryRec(head, name, phoneNumber);
    }

    private Node addEntryRec(Node root, String name, String phoneNumber){
        if (root == null){
            root = new Node(name, phoneNumber);
            return root;
        }
        if (name.compareTo(root.name) < 0){
            root.left = addEntryRec(root.left, name, phoneNumber);
        } else if (name.compareTo(root.name) > 0) {
            root.right = addEntryRec(root.right, name, phoneNumber);
        }
        return root;
    }

    public void removeEntry(String name) {
        head = removeEntryRec(head, name);
    }

    private Node removeEntryRec(Node root, String name){
        if (root == null) return root;

        if (name.compareTo(root.name) < 0){
            root.left = removeEntryRec(root.left, name);
        } else if (name.compareTo(root.name) > 0){
            root.right = removeEntryRec(root.right, name);
        } else{
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            root.name = minValue(root.right);
            root.right = removeEntryRec(root.right, root.name);
        }
        return root;
    }

    private String minValue(Node root) {
        String minValue = root.name;
        while (root.left != null) {
            minValue = root.left.name;
            root = root.left;
        }
        return minValue;
    }

    private Node searchRec(Node root, String name) {
        if (root == null || root.name.equals(name)) {
            return root;
        }
        if (name.compareTo(root.name) < 0) {
            return searchRec(root.left, name);
        }
        return searchRec(root.right, name);
    }

    public List<String> listEntriesAscending() {
        List<String> result = new ArrayList<>();
        inOrderRec(head, result);
        return result;
    }

    private void inOrderRec(Node root, List<String> result) {
        if (root != null) {
            inOrderRec(root.left, result);
            result.add(root.name + ": " + root.phoneNumber);
            inOrderRec(root.right, result);
        }
    }
    public List<String> listEntriesDescending() {
        List<String> result = new ArrayList<>();
        inOrderDescRec(head, result);
        return result;
    }

    private void inOrderDescRec(Node root, List<String> result) {
        if (root != null) {
            inOrderDescRec(root.right, result);
            result.add(root.name + ": " + root.phoneNumber);
            inOrderDescRec(root.left, result);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P84_Phone_Book node = new P84_Phone_Book();

        Boolean isTrue = true;

        while (isTrue) {
            System.out.print("1. Insert Node \n2. Delete Node \n3. Search : \n4. Ascending list : \n5. Descending list : \n6. Exit : ");
            String ope = sc.nextLine();

            switch(ope)
            {
                case "1" : 
                    System.out.print("Enter name : ");
                    String name = sc.nextLine();
                    System.out.print("Enter number : ");
                    String number = sc.nextLine();
                    node.addEntry(name, number);
                    break;

                case "2" : 
                    System.out.print("Enter name to delete : ");
                    String deletename = sc.nextLine();
                    node.removeEntry(deletename);
                    break;

                case "3":
                    System.out.println("Enter name to serach number : ");
                    String num = sc.nextLine();
                    node.searchRec(head, num);
                    break;

                case "4":
                    for (String entry : node.listEntriesAscending()) {
                        System.out.println(entry);
                    }
                    break;

                case "5":
                    for (String entry : node.listEntriesDescending()) {
                        System.out.println(entry);
                    }
                    break;

                case "6":
                    isTrue = false;
            }
        }
    }
}