import java.util.Scanner;

class Number{
    int a;
    int b;

    Number(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void getDetails(){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("A = "+a+"  "+"B = "+b);
    }
}

public class Q33{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Two number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Number A1 = new Number(a,b);
        A1.getDetails();
    }
}
