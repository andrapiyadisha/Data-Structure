import java.util.Scanner;
public class BinarySearchUsingRecursion {
    int binarySearch(int a[], int l, int r, int x)
    {
        if(r>=l){
            int mid = (l+r)/2;

            if(a[mid] == x)
            {
                return mid;
            }
            else if(a[mid]>x)
            {
                return binarySearch(a, l, mid-1, x);
            }
            else if(a[mid]<x)
            {
                return binarySearch(a, mid+1, r, x);
            }
        }
            return -1;
    }
    public static void main(String[] args) {
        BinarySearchUsingRecursion num1 = new BinarySearchUsingRecursion();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter a array in order element:");
        for(int i=0;i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Display array:");
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Array is :"+a[i]);
        }
        System.out.println("Enter a number whice you want serch: ");
        int x = sc.nextInt();

        int found = num1.binarySearch(a, 0, n-1, x);

        if(found == -1)
        {
            System.out.println("Number is not found");
        }
        else{
            System.out.println("Number is found");
        }
    }
}