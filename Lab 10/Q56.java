import java.util.Scanner;
//Repesent a node of singalelinked list
class Node{
    int info;
    Node link;

    Node(int data){
        this.info = data;
        this.link = null;
    }
}   
public class Q56{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a noad: ");
        int n = sc.nextInt();
        Node newNode = new Node(n);
        System.out.println("Linked List is  "+newNode.info);
    }
}