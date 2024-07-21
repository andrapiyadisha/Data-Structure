import java.util.Scanner;
public class FactoRec{
  static int fact(int n){

        if(n== 0 || n ==1){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println(ans);
    }
}