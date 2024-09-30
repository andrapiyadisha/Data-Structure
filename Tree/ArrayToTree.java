import java.util.*;

class Node{
    int info;
    Node left;
    Node right;

    Node(int data){
        this.info = data;
        this.left = null;
        this.right = null;
    }
}

class Tree{
    Node root;

    public Node constTree(int[] arr ,int i){
          if(i >= arr.length){
            return null;
          }
          Node temp = new Node(arr[i]);
          temp.left = constTree(arr, 2*  i + 1);
          temp.right = constTree(arr, 2 * i + 2);
          return temp;
    }
    public void preOrder(Node root){
        if(root != null){
            System.out.println(root.info + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.println(root.info + " ");
            inOrder(root.right);
        }
    }
    public void postOrder(Node root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.info + " ");
        }
    }
}

public class ArrayToTree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter a Element ["+i+"] : ");
            arr[i] = sc.nextInt();
        }
        Tree tree = new Tree();
        tree.root = tree.constTree(arr, 0);
        System.out.print("PreOrder traversal of constructed tree:");
        tree.preOrder(tree.root);
        //System.out.println(" ");
        System.out.print("InOrder traversal of constructed tree:");
        tree.inOrder(tree.root);
        //System.out.println(" ");
        System.out.print("PostOrder traversal of constructed tree:");
        tree.postOrder(tree.root);
        sc.close();
    }
}
