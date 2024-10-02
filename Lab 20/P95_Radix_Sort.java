import java.util.Scanner;

public class P95_Radix_Sort {

    public static int maxElement(int[] ar, int n)
    {
        int max = ar[0];

        for(int i=1;i<n;i++)
        {
            if(ar[i] > max)
            {
                max = ar[i];
            }
        }

        return max;
    }

    public static void radixSort(int[] ar, int n, int temp)
    {
        int[] ans = new int[n+1];
        int[] count = new int[10];

        for(int i=0;i<n;i++)
        {
            count[(ar[i]/temp)%10]++;
        }

        for(int i=1;i<10;i++)
        {
            count[i] += count[i-1];
        }

        for(int i=n-1;i>=0;i--)
        {
            ans[count[(ar[i]/temp)%10]-1] = ar[i];
            count[(ar[i]/temp)%10]--;
        }

        for(int i=0;i<n;i++)
        {
            ar[i] = ans[i];
        }
    }

    public static void radix(int[] ar, int n)
    {
        int max = maxElement(ar, n);

        for(int i= 1; max/i > 0; i *= 10)
        {
            radixSort(ar, n, i);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int[] ar = new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter " + (i+1) + " Element : ");
            ar[i] = sc.nextInt();
        }

        radix(ar, n);

        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i] + " ");
        }
    }
}