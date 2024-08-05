import java.util.Scanner;
public class P62_RemoveDuplicate {
 //Represent a node of single linked list
 class Node{
    int info;
    Node link;

  public Node(int data) {
    this.info = data;
    this.link = null;
  }
 } 
 public Node first = null;

 public void insertAtFirst(int data){
    // New Node created from availability stack
    Node newNode = new Node(data);

    // If list is empty , newNode will be the first Node
    if (first == null) {
        first = newNode;
        return;
    }

    // reference variable save: which will store the address of the first node
    Node save = first;
    // Make the newNode the first node
    first = newNode;
    // node save will be connected after the first node
    first.link = save;
}

public void display() {
    if (first == null) {
        System.out.println("List is empty");
        return;
    }
    Node save = first;
    while (save != null) {
        System.out.print("->"+save.info);
        save = save.link;
    }
    System.out.println("");
}

public void deleteDuplicates() {
    if (first == null) {
        display();
        return;
    }
    Node save = first;

    while (save != null) {
        Node prev = save;
        Node temp = save.link;
        while (temp != null) {
            if (save.info == temp.info) {
                prev.link = temp.link;
            } else {
                prev = temp;
            }
            temp = temp.link;
        }
        save = save.link;
    }
    display();
}


    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        P62_RemoveDuplicate list = new P62_RemoveDuplicate();

        System.out.println("Enter 1 for inserting nubers into linked list,");
        System.out.println("Enter 2 if you want to see your LL,");
        System.out.println("Enter 3 to delete the duplicates .");

        boolean istheEnd = false;
        while (true) {
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to be inserted:");
                    int n = sc.nextInt();
                    list.insertAtFirst(n);
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                    list.deleteDuplicates();
                    istheEnd = true;
                    break;
                default:
                    System.out.println("invalid choice");
            }
            if (istheEnd) {
                break;
            }
        }
    }
}