import java.util.Scanner;

public class P77_BST {
    class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node root = null;
    
    
    public Node insertTree(Node root, int data){
        if(root == null){
            return new Node(data);
        }
        if(data < root.data){
            root.left = insertTree(root.left, data);
        }else{
            root.right = insertTree(root.right, data);
        }
        return root;
         
    }

    public Node deleteTree(Node root, int data){
        if(root == null){
            return null;
        }
        if(data < root.data){
            root.left = deleteTree(root.left, data);
        }if(data > root.data){
            root.right = deleteTree(root.right, data);
        }else{
            if(root.left ==null){
                return root.right;            
            }else if(root.right == null){
                return root.left;
            }
            root.data = findMin(root.right);
            root.right = deleteTree(root.right, root.data);

        }
        return root;
    }
    public int findMin(Node root){
        int min = root.data;
        while(root.left != null){
            min = root.left.data;
            root = root.left;
        }
        return min;
    }

    boolean searchTree(Node root, int data){
        if(root == null){
            return false;
        }else if(root.data == data){
            return true;
        }else if(data < root.data){
            return searchTree(root.left, data);
        }else if(data > root.data){
            return searchTree(root.right, data);
        }
        return false;
    }
    

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of the root node");
    int n = sc.nextInt();
    System.out.println("Enter 1 if you want to add a node ");
    System.out.println("Enter 2 if you want to delete a node ");
    System.out.println("Enter 3 if you want to search a node ");
    System.out.println("Enter 4 if you want to Exit");

    P77_BST bTree = new P77_BST();
    while (true) {
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the data of the node");
                int data = sc.nextInt();
                bTree.root = bTree.insertTree(bTree.root, data);
                break;
            
            case 2:
                System.out.println("Enter the data of the node");
                int data1 = sc.nextInt();
                bTree.root = bTree.deleteTree(bTree.root, data1);
                System.out.println("Deleted Node is : "+ data1);
                break;

            case 3:
                System.out.println("Enter the data of the node");
                int data2 = sc.nextInt();
                boolean ans = bTree.searchTree(bTree.root, data2);
                if (ans){
                    System.out.println("Node is present");  
                }
                else{
                    System.out.println("Node is not present");
                }
                break;
            
            case 4:
                System.out.println("Exiting...");
                sc.close();
                System.exit(0);

            default:
                System.out.println("Invalid choice");
                break;
            }
    }
    
    }
}