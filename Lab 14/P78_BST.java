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

class BST{
    Node root;

    public Node constTree(int a[], int i){
        if(i>=a.length){
            return null;
        }
        Node temp = new Node(a[i]);
        temp.left = constTree(a, i*2+1);
        temp.right = constTree(a,i*2+2);
        return temp;
    }

    public void preOrder(Node root){
        if(root!=null){
            System.out.println(root.info + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.println(root.info + " ");
            inOrder(root.right);
        }
    }

    public void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.info + " ");
        }
    }
}



public class P78_BST {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a nuber of BST roots: ");
    int n = sc.nextInt(); 
    int a[] = new int[n];
    for(int i=0;i<a.length;i++){
        a[i] = sc.nextInt();
    }
    BST tree = new BST();
    tree.root = tree.constTree(a,0);
    System.out.println("Preorder Travelser of constracted tree: ");
    tree.preOrder(tree.root);
    System.out.println("Inorder travelser of constracted tree: ");
    tree.inOrder(tree.root);
    System.out.println("Postorder travelser of constracted tree: ");
    tree.postOrder(tree.root);

    }
}
