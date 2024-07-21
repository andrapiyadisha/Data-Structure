import java.util.Scanner;
public class Q19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            int temp = 1;
            for(int k=0;k<=i;k++){
                System.out.print(temp+" ");
                temp = temp*(i-k)/(k+1);
            }
            System.out.println();
        }
    }
}