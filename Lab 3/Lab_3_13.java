 import java.util.Scanner;
public class Lab_3_13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter a array:");
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Display array:");
        for(int i=0;i<a.length;i++){
            System.out.println("Array is :"+a[i]);
        }
    }
}