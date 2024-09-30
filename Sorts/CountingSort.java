import java.util.Scanner;

public class CountingSort{
    static int []a;
    static int []b;
    static int []c;
    static void Counting_Sort(int []a,int n, int k){
        c = new int[k+1];
        b = new int[n];
        for(int i=0;i<n;i++){
            c[a[i]]++;
        }
        for(int i=1;i<=k;i++){
            c[i] = c[i] + c[i-1];
        }
        for(int i=n-1; i>=0; i--){
            b[c[a[i]]-1] =a[i];
            c[a[i]]--;
        }
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Array : ");
        int n = sc.nextInt();
        a = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter " + (i+1) + " Element : ");
            a[i] = sc.nextInt();
            if(a[i]>k){
                k=a[i];
            }
        }
       // CountingSort co = new CountingSort(arr);
        Counting_Sort(a, n, k);
        System.out.println("Sorted Array: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

    }
}