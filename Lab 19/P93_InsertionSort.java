import java.util.Scanner;
public class P93_InsertionSort{
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
        int i = 1;
        while(i<n){
            int key = a[i];
            int j = i-1;
            while(j>=0 && a[j]>key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1]=key;
            i++;
        }
        
        for(int k=0;k<n;k++)
        {
            System.out.println("Array is :"+a[k]);
        }
        
    }
}

