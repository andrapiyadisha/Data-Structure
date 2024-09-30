import java.util.Scanner;

public class P82_Construct_From_Pre_Post {

    static int preindex;
 
    static class node 
    {
        int data;
        node left, right;
 
        public node(int data) 
        {
            this.data = data;
        }
    }

    static node constructTreeUtil(int pre[], int post[], int l, 
                                   int h, int size) 
    {
         
        if (preindex >= size || l > h)
            return null;
 
        node root = new node(pre[preindex]);
        preindex++;
         
        if (l == h || preindex >= size)
            return root;
        int i;
         
        for (i = l; i <= h; i++) 
        {
            if (post[i] == pre[preindex])
                break;
        }
        if (i <= h) 
        {
            root.left = constructTreeUtil(pre, post, l, i, size);
            root.right = constructTreeUtil(pre, post, i + 1, h-1, size);
        }
        return root;
    }

    static node constructTree(int pre[], int post[], int size) 
    {
        preindex = 0;
        return constructTreeUtil(pre, post, 0, size - 1, size);
    }

    static void printInorder(node root) 
    {
        if (root == null)
            return;
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int pre[] = new int[n];
        int post[] = new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter preorder " + (i+1) + " element : ");
            pre[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter postorder " + (i+1) + " element : ");
            post[i] = sc.nextInt();
        }
 
        int size = pre.length;
        node root = constructTree(pre, post, size);
 
        System.out.println("Inorder traversal of the constructed tree:");
        printInorder(root);
    }
}