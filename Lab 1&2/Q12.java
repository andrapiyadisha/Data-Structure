import java.util.Scanner;
public class Q12{
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int sum = 0,num;
        int temp = n;
        String a = Integer.toString(n);
        int c = a.length();
            while(temp>0){
                num = temp % 10;
                sum+=Math.pow(num,c);
                temp = (int)Math.floor(temp/10);
            }
            if(sum == n){
                System.out.println("Armstrong");
            }else{
               System.out.println("Not Armstrong");
            }

       }
}