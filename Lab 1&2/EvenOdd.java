import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Number:");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
    }
}