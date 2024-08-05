import java.util.Scanner;
public class Q58{
    class Node{
    int info;
    Node link;

    Node(int data){
        this.info = data;
        this.link = null;
    }
}
public Node first = null;
public Node last = null;

public void insertInCLL(int data){
    Node newNode = new Node(data);
    if(first==null){
       first=last=newNode;
       newNode.link=first;
       return;
    }
    newNode.link = first;
    last.link = newNode;
    last=newNode;
}

public void display(){
    if(first==null){
        System.out.println("List is empty");
        return;
    }
    Node save=first;
    do{
        System.out.print(save.info + "-->");
        save=save.link;
    }while(save!=first);
    System.out.println("");
}

public int sizeOfCircularLinkedList(){
    if(first==null){
        return 0;
    }
    Node save=first;
    int count=0;
    do{
      count++;
      save=save.link;
    }while(save!=first);
    
    return count;
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Q58 count = new Q58();
        System.out.println("Enter 1 for insert a node in CLL");
        System.out.println("Enter 2 if you want display CLL");
        System.out.println("Enter 3 if you want count CLL");
        System.out.println("Please Enter 4 if you want to exit the process");

        boolean isTheEnd = false;
        while ((true)) {
            System.out.println("Enter a your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the number to be inserted at last:");
                    int num1 = sc.nextInt();
                    count.insertInCLL(num1);
                    break;
                case 2: 
                    count.display();
                    break;
                case 3:
                    System.out.println("Size of Circular LL :"+count.sizeOfCircularLinkedList());
                    break;
                case 4:
                    System.out.println("Exiting the process");
                    isTheEnd = true;
                    break;    
            
                default:
                System.out.println("Invalid choice");
            }
            if (isTheEnd) {
                break;
            }
        }
        
    }
}