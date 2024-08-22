import java.util.Scanner;
public class P96_MergeSort{
    static int a[];        
       static void merge(int low, int mid, int high)
        {
            int b[] = new int[a.length];
            int k;
            int h = low;
            int i = low;
            int j = mid + 1;
    
            while(h<=mid && j<=high)
            {
                if(a[h] <= a[j])
                {
                    b[i] = a[h];
                    h++;
                }
                else
                {
                    b[i] = a[j];
                    j++;
                }
                i++;
            }
            if(h>mid)
            {
                for(k=j;k<=high;k++)
                {
                    b[i] = a[k];
                    i++;
                }
            }    
            else
            {
                for(k=h;k<=mid;k++)
                {
                    b[i] = a[k];
                    i++;
                }
            }    
            for(k=low;k<=high;k++){
                a[k] = b[k];
            }
        }
    public static void mergeSort(int low,int high)
    {
        if(low<high)
        {
           int mid = (low + high)/2;
            mergeSort(low,mid);
            mergeSort(mid+1,high);
            merge(low,mid,high);
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Array : ");
        int n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter " + (i+1) + " Element : ");;
            a[i] = sc.nextInt();
        }
        mergeSort(0, n - 1);
        System.out.println("Sorted array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
