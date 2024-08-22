import java.io.*;
import java.util.Scanner;

public class P97_QuickSort {  
    static int []k;
    static void Quick_Sort(int []k, int LB, int UB)
    {
    Boolean flag = true;
    if(LB < UB){
    int i = LB;
    int j = UB + 1;
    int key = k[LB];

    while (flag == true) {
        i++;

        while (i<k.length && k[i]<key) 
        {
            i++;
        }
        j--;
        while (j>=0 && k[j]>key)
        {
            j--;
        }
        if(i<j)
        {
            int temp = k[i];
            k[i] = k[j];
            k[j] = temp;
        } else
        {
            flag = false;
            break;
        }
    }
     int temp = k[LB];
     k[LB] = k[j];
     k[j] = temp;
     Quick_Sort(k, LB, j-1);
     Quick_Sort(k, j+1, UB);

    }
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Array : ");
        int n = sc.nextInt();
        k = new int[n];
        for (int i = 0; i < k.length; i++)
        {
            System.out.print("Enter " + (i+1) + " Element : ");
            k[i] = sc.nextInt();
        }
        Quick_Sort(k, 0, n-1);
        System.out.println("Sorted array: ");
        for (int i = 0; i < k.length; i++)
        {
            System.out.println(k[i] + " ");
        }   
    }
}
