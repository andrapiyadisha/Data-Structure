import java.util.Scanner;

public class Q26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number of first Array");
            int n = sc.nextInt();
            int[] arr1 = new int[n];
            System.out.println("Enter a Array Number: ");
            for(int i=0;i<n;i++){
                arr1[i] = sc.nextInt();
            }
            System.out.println("Enter a number of Second Array");
            int m = sc.nextInt();
            int[] arr2 = new int[m];
            System.out.println("Enter a Array Number: ");
            for(int i=0;i<m;i++){
                arr2[i] = sc.nextInt();
            }
            int[] result = new int[arr1.length + arr2.length];
            int k=0;
            for(int i=0;i<result.length;i++){
                if(i<arr1.length){
                    result[i] = arr1[i];
                }else{
                    result[i] = arr2[k];
                    k++;
                }
            }
            for(int i=0;i<result.length;i++){
                System.out.println("newarr = "+result[i]);
            }
            

    }
}
