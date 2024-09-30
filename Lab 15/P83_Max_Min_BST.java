import java.util.*;

public class P83_Max_Min_BST {
    static class Node
    {
        int value;
        Node left;
        Node right;

        Node(int data)
        {
            this.value = data;
            left = null;
            right = null;
        }
    }

    static Node head = null;
    static List<Integer> ans = new ArrayList<>();

    public static void insert()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter node value : ");
        int value = sc.nextInt();
        Node n = new Node(value);

        if(head == null)
        {
            head = n;
        }
        else
        {
            Node temp = head;
            while(true)
            {
                if(value < temp.value && temp.left != null)
                {
                    temp = temp.left;
                }
                else if(value < temp.value && temp.left == null)
                {
                    temp.left = n;
                    break;
                }
                else if(value > temp.value && temp.right != null)
                {
                    temp = temp.right;
                }
                else if(value > temp.value && temp.right == null)
                {
                    temp.right = n;
                    break;
                }
            }
        }
    }

    public static void inOrder(Node root)
    {
        if(root != null)
        {
            inOrder(root.left);
            ans.add(root.value);
            inOrder(root.right);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P83_Max_Min_BST node = new P83_Max_Min_BST();

        Boolean isTrue = true;

        while (isTrue) {
            node.insert();

            System.out.println("Want to add more ???");
            String ans = sc.nextLine();

            if(ans.equals("yes") || ans.equals("y"))
            {
                isTrue = true;
            }
            else
            {
                isTrue = false;
            }
        }

        node.inOrder(head);

        System.out.println("Min element is  : " + ans.get(0) + " \nMax element is :  " + ans.get(ans.size()-1));
    }
}