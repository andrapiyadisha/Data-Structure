public class FullBinaryTreePostPre {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int Pidx;
    static Node constructTreeUtil(int pre[], int post[], int l, int h, int size){
        if(Pidx >= size || l > h){
            return null;
        }

        Node root = new Node(pre[Pidx]);
        Pidx++;

        if(l == h || Pidx >= size){
            return root;
        }

        int i;
        for(i = l; i <= h; i++){
            if(post[i] == pre[Pidx]){
                break;
            }
        }

        if(i <= h){
            root.left = constructTreeUtil(pre, post, l, i, size);
            root.right = constructTreeUtil(pre, post, i+1, h-1, size);
        }
        return root;
    }    
    static Node constructTree(int pre[], int post[], int size){
        Pidx = 0;
        return constructTreeUtil(pre, post, 0, size-1, size);
    }
    static void PrintInorder(Node root){
        if(root == null){
            return;
        }
        PrintInorder(root.left);
        System.out.print(root.data + " ");
        PrintInorder(root.right);
    }
    public static void main(String[] args) {
        int pre[] = {1, 2, 4, 5, 3, 6, 9};
        int post[] = {4, 5, 2, 6, 9, 3, 1};
        Node root = constructTree(pre, post, pre.length);
        PrintInorder(root);
    }
    
}
