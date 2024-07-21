import java.util.Scanner;

public class Q24{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
            b[i] = a[i];
        }
        System.out.println("Display array:");
        for(int i=0;i<a.length;i++){
            System.out.println("Array is :"+a[i]);
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
        System.out.println("Sorted Array is: ");
        for(int i=0;i<b.length;i++){
            System.out.println("Array is = :"+b[i]);
        }

        System.out.println("Enter a number and its index: ");
        int ind = sc.nextInt();
        int[] c = new int[n-1];
        int k=0;

       for(int i=0;i<b.length;i++){
        if(i==ind){
           continue;
       }else{
        c[k] = b[i];
        k++;
       }
       }
       System.out.println("Final Array after deletion: ");
       for(int i=0;i<c.length;i++){
        System.out.println("Array is = :"+c[i]);
    }
        
    }
}