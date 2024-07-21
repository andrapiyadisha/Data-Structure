import java.util.Scanner;
public class Q27 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Words: ");
    String a = sc.next();
    String word ="";
    for(int i=0;i<a.length();i++){
        if(a.charAt(i)>=65 && a.charAt(i)<=90){
            word += (char)(a.charAt(i)+32); 
        }else if(a.charAt(i)>=97 && a.charAt(i)<=122){
            word +=(char)(a.charAt(i)-32);
        }
    }
    System.out.println("Word = "+word);
  }
}