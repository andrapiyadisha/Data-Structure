public class P80_CheckSymmetric {

public class Node{
    int info;
    Node left;
    Node right;

        Node(int data){
            info = data;
            left = null;
            right = null;
        }
}

public Node root = null;

public static boolean checkSymmetric(Node l, Node r){
    if(l == null && r == null){
        return true;
    }
    if(l == null || r == null){
        return false;
    }
    return(l.info == r.info) && checkSymmetric(l.left, r.right) && checkSymmetric(l.right, r.left);
}

    public static void main(String[] args) {
        P80_CheckSymmetric tree = new P80_CheckSymmetric();

        tree.root = tree.new Node(8);
        tree.root.left = tree.new Node(5);
        tree.root.right = tree.new Node(5);
        tree.root.left.left = tree.new Node(3);
        tree.root.left.right = tree.new Node(6);
        tree.root.right.left = tree.new Node(6);
        tree.root.right.right = tree.new Node(3);

        boolean isSame = tree.checkSymmetric(tree.root.left, tree.root.right);
        if(isSame){
            System.out.println("Symmetric");
        }
        else{
            System.out.println("Not Symmetric");
        }
        
    }
}