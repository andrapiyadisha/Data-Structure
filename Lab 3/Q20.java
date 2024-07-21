import java.util.Scanner;
public class Q20 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a Number Words: ");
      int n = sc.nextInt();
      String[] a = new String[n];
      System.out.println("Enter a Words: ");
      for(int i=0;i<n;i++){
        a[i] = sc.next();
      }
     String temp;
      System.out.println("Sorted Words are: ");
      for(int i=0;i<n;i++){
           for(int j=0;j<a.length-1;j++){
            if(a[j].charAt(0)>a[j+1].charAt(0)){
               temp = a[j];
               a[j] = a[j+1];
               a[j+1] = temp;
            }
           }
      }
      for(int i=0;i<n;i++){
        System.out.println(a[i]);
      }
    }
}