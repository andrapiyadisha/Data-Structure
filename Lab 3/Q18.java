import java.util.Scanner;
public class Q18{
    public static void main(String[] args){
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
        System.out.println("Enter a two number whom repalce");
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Display Final array:");
        for(int i=0;i<a.length;i++){
            if(a[i] == b){
              a[i] = c;
              c = b;
              b = a[i];
            }
            System.out.println("Array is :"+a[i]);
        }
    }
}        