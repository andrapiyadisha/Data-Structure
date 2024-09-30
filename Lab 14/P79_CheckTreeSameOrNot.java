import java.util.Scanner;

public class P79_CheckTreeSameOrNot {

    class Node{
        int info;
        Node left;
        Node right;

        public Node(int data){
            info = data;
            left = null;
            right = null;
        }
    }

    public Node root = null;

    public static boolean checkSimilar(Node t1, Node t2){
        if(t1 == null && t2 == null){
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        return(t1.info == t2.info) && checkSimilar(t1.left , t2.left) && checkSimilar(t1.right , t2.right);
    }


    public static void main(String[] args) {

        P79_CheckTreeSameOrNot tree1 = new P79_CheckTreeSameOrNot();
        P79_CheckTreeSameOrNot tree2 = new P79_CheckTreeSameOrNot();

        tree1.root = tree1.new Node(1);
        tree1.root.left = tree1.new Node(2);
        tree1.root.right = tree1.new Node(3);
        tree1.root.left.left = tree1.new Node(4);
        tree1.root.left.right = tree1.new Node(5);
        tree1.root.right.left = tree1.new Node(6);
        tree1.root.right.right = tree1.new Node(7);

        tree2.root = tree2.new Node(1);
        tree2.root.left = tree2.new Node(2);
        tree2.root.right = tree2.new Node(3);
        tree2.root.left.left = tree2.new Node(4);
        tree2.root.left.right = tree2.new Node(5);
        tree2.root.right.left = tree2.new Node(6);
        tree2.root.right.right = tree2.new Node(7);

        if(P79_CheckTreeSameOrNot.checkSimilar(tree1.root,tree2.root)){
            System.out.println("Both Trees are same");
        }
        else{
            System.out.println("Both Trees are Not Same");
        }
        
    }
}