import java.util.Scanner;
public class Lab_3_17{
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
        int count = 0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
               if(a[i]==a[j]){
               count++;
               break;   
               }
            }if(count == 1){
                break;
            }
        }
        if(count == 1){
            System.out.println("Array is doublicate");
        }else{
            System.out.println("Array is not doublicate");
        }
    }
}        