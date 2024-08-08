import java.util.Scanner;
public class P92_BubbleSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter a array in order element:");
        for(int i=0;i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }
        int flag = 0;
        for(int i=0;i<a.length-2;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag ++;
                }
            }
        }
        if(flag == 0)
        {
            System.out.println("input Array is sorted");
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Array is :"+a[i]);
        }
        
    }
}

