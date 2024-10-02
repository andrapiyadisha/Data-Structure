 import java.util.Scanner;
public class P94_SlectionSort{
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
        for(int i=0;i<a.length-1;i++)
        {
            int min = i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[min])
                {
                  min = j;  
                }
                int temp = a[min];
                    a[min] = a[i];
                    a[i] = temp;
            }
        }
        System.out.println("Sorted Array :");
        for(int k=0;k<n;k++)
        {
            System.out.println("Array is :"+a[k]);
        }
        
    }
}

