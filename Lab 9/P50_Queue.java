import java.util.Scanner;;

class Queue
{
    int n;
    int f;
    int r;
    int[] queue;

    Queue()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Size of Queue: ");
        n = sc.nextInt();
        queue = new int[n];
        f = 0;
        r = 0; 
    }
    public void inQueue()
    {
        Scanner sc = new Scanner(System.in);
        if(r == n)
        {
            System.out.println("Queue overflow");
        }
        else
        {
            System.out.println("Enter a number of Queue:");
            queue[r] = sc.nextInt();
            r++;
        }
        if(f == 0)
        {
            f = 1;
        }
    }

    public int deQueue()
    {
        int x = 0;
        if((f-1) == r )
        {
            System.out.println("Queue Underflow");
        }
        else
        {
             x = queue[f-1];
             f++;
        }
        return x;
    }

    public void display()
    {
        for(int i=(f-1) ; i < r; i++)
        {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }
}
public class P50_Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue q = new Queue();
        Boolean isTrue = true;

        while(isTrue)
        {
            System.out.println("Enter 1. for Inqueue \nEnter 2. for Dequeue \nEnter 3. for Display \nEnter 4. for Exit : ");
            int temp = sc.nextInt();
            switch (temp) {
                case 1:
                    q.inQueue();
                    break;

                case 2:
                    System.out.println("Element is : " + q.deQueue());
                    break;

                case 3:
                    q.display();
                    break;

                case 4:
                    isTrue = false;
            }
        }
    }
}