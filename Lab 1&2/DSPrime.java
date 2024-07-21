import java.util.Scanner;
public class DSPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int count = 0;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count == 1){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
    
}