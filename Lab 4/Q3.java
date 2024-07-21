import java.util.Scanner;

public class Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n+1];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Display array:");
        for(int i=0;i<a.length;i++){
            System.out.println("Array is :"+a[i]);
        }

        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int Index = sc.nextInt();
        for(int i=0;i<n+1;i++){
            if(i<Index){
                b[i] = a[i];
            }else if(i>Index){
                b[i] = a[i-1];
            }else{
                b[i] = num;
                        }
            System.out.println("Araay "+b[i]);
        }
        int min,minIndex;
        for(int i=0;i<b.length-1;i++){
            min = b[i];
            minIndex = i;
            for(int j=i+1;j<b.length;j++){
              if(min>b[j]){
                min = b[j];
                minIndex = j;
              }
            }
            if(minIndex!=i){
                b[minIndex] = b[i];
                b[i] = min;
            }
        }
        for(int i=0;i<b.length;i++){
            System.out.println("Array is = :"+b[i]);
        }
        
    }
}