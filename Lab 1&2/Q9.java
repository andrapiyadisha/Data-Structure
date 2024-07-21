import java.util.Scanner;
public class Q9{
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Seconds: ");
        int sec = sc.nextInt();
        int hour, min;
        hour = sec/3600;
        sec = sec%3600;
        min = sec/60;
        sec = sec%60;
        System.out.println(hour+" Hour "+min+" Min "+sec+" Sec "); 
       }
}