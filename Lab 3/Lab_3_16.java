import java.util.Scanner;
public class Lab_3_16{
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
        int small = a[0];
        int large = a[0];
        int smallIndex = 0;
        int largeIndex = 0;

        for(int i=0;i<a.length;i++){
            if(a[i]>large){
                large = a[i];
                largeIndex = i;
            }else if(a[i]<small){
                small = a[i];
                smallIndex = i;
            }
        }
        System.out.println("Large number"+" "+large+"  "+"Large Index"+largeIndex);
        System.out.println("Small number"+" "+small+"  "+"Small Index"+smallIndex);
    }
}