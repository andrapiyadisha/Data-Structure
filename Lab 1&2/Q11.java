import java.util.Scanner;
public class Q11{
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=1;j<=(i+1);j++){
              sum = sum +j;
            }
        }
        System.out.println("Sum = "+sum);
       }
}