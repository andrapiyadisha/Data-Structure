import java.util.Scanner;
public class P91_BinarySearch{
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
        System.out.println("Display array:");
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Array is :"+a[i]);
        }
        System.out.println("Enter a number whice you want serch: ");
        int key = sc.nextInt();
        int l=0,r=n-1;
        while(l<=r)
        {
            int mid = (l+r)/2;
            if(a[mid] == key)
            {
                System.out.println("Element found");
                return;
            }
            else if(a[mid] > key)
            {
                r = mid-1;
            }
            else if(a[mid] < key)
            {
                l = mid+1;
            }
        }
        System.out.println("Element is Not found");
    }
}

