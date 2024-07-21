import java.util.Scanner;
public class Q10{
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Days: ");
        int day = sc.nextInt();
        int year, week;
        year = day/365;
        day = day%365;
        week = day/7;
        day = day%7;
        System.out.println(year+" YY "+week+" WW "+day+" DD "); 
       }
}