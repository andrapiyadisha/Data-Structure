import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n-1];
        System.out.println("Enter a Array: ");
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Display array:");
        for(int i=0;i<a.length;i++){
            System.out.println("Array is :"+a[i]);
        }
        System.out.println("Enter a number and its index: ");
        int ind = sc.nextInt();
        int k=0;

       for(int i=0;i<a.length;i++){
        if(i==ind){
           continue;
       }else{
        b[k] = a[i];
        k++;
       }
       }
       System.out.println("Final Array is: ");
       for(int i=0;i<a.length;i++){
        System.out.println(b[i]);
       }
       
        
    }
}