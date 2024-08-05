import java.util.Scanner;

class Peacock
{
    String[] queue;
    int front;
    int rear;

    Peacock()
    {
        queue = new String[100];
        front = 0;
        rear = 0;
    }

    public void buy_color(String color)
    {
        queue[rear] = color;
        rear++;
    }

    public String fetch_color()
    {
        if(rear == 0)
        {
            return "No Data";
        }
        else
        {
            String temp = queue[0];

            for(int i=0;i<rear-1;i++)
            {
                queue[i] = queue[i+1];
            }

            queue[rear-1] = temp;

            return temp;
        }
    }

    public void display_Suitcase()
    {
        for(int i=0;i<rear;i++)
        {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}


public class P54_PersyPeacock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Peacock peacock = new Peacock();
        System.out.println("Enter total queries : ");
        int queries = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<queries;i++)
        {
            String temp = sc.nextLine();

            if(temp.equals("fetch"))
            {
                System.out.println(peacock.fetch_color());
            }
            else
            {
                peacock.buy_color(temp);
            }

            peacock.display_Suitcase();
        }
    }
}

