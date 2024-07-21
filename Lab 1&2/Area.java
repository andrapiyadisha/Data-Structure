import java.util.Scanner;
public class Area{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a radius:");
        int r = sc.nextInt();
        System.out.println("Area"+(3.14*r*r));
    }
}