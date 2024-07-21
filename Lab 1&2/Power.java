import java.util.Scanner;
public class Power{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ans=1;
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Enter a power");
        int x = sc.nextInt();
        for(int i=1;i<=x;i++){
            ans = n*ans;
        }
        System.out.println("Power:"+ans);
    }
}