import java.util.Scanner;

public class P99_Shell_Sort
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int[] ar = new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter " + (i+1) + " Element : " );
            ar[i] = sc.nextInt();
        }

        int gap = n/2;

        while(gap > 0)
        {
            int i = 0;

            while(i < n-gap)
            {
                int j = i+gap;

                while(j < n )
                {
                    if(ar[i] > ar[j])
                    {
                        int temp = ar[i];
                        ar[i] = ar[j];
                        ar[j] = temp;
                    }

                    j += gap;
                }
                i++;
            }

            gap = gap/2;
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i] + " ");
        }
    }
}