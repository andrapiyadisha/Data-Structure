import java.util.Scanner;
 
public class Lab_3_14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a number of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter a array:");
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Entea a staring number up to n: ");
        int m = sc.nextInt();
        for(int i=m;i<a.length;i++){
             sum = sum + a[i];
        }
        System.out.println("Sum is :"+sum);
        
    }
}