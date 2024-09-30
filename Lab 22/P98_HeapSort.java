import java.util.Scanner;

public class P98_HeapSort{
    static int []arr;
    P98_HeapSort(int []arr){
        buildmaxHeap(arr);
        for(int i = arr.length-1;i>=0;i--){
            swap(arr, 0, i);
            heapify(arr, i ,0);
        }
    }
        static void buildmaxHeap(int []arr){
            int n = arr.length;
            for(int i=(n/2)-1;i>=0;i--){
                heapify(arr,n,i);
            }
        }
        static void heapify(int []arr, int n, int i){
           int maxindex = i;
           int leftChild = 2*i+1;
           int rightChild = 2*i+2;

            if(leftChild < n && arr[leftChild] > arr[maxindex]){
                maxindex = leftChild;
            }
            if(rightChild < n && arr[rightChild] > arr[maxindex]){
                maxindex = rightChild;
            }

            if(i!=maxindex){
                swap (arr, i, maxindex);
                heapify(arr,n,maxindex);
            }
        }
        static void swap(int []arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Array : ");
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print("Enter " + (i+1) + " Element : ");
            arr[i] = sc.nextInt();
        }
        P98_HeapSort hs = new P98_HeapSort(arr);

        System.out.println("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}