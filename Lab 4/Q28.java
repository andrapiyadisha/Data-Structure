import java.util.Scanner;
class Arry{
 public int sum(int[] a){
    int sum=0;
    for(int i=0;i<a.length;i++){
        sum += a[i];
    }
    return sum;
 }
 public int avg(int[] a){
    int s=sum(a);
    return s/a.length;
 }
 public int max(int[] a){
    int max=a[0];
    for(int i=0;i<a.length;i++){
        if(a[i]>max){
            max = a[i];
        }
    }
    return max;
 }
 public int min(int[] a){
    int min=a[0];
    for(int i=0;i<a.length;i++){
        if(a[i]<min){
            min = a[i];
        }
    }
    return min;
 }
}

public class Q28{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Array number: ");
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
    }
    Arry obj = new Arry();
    System.err.println("sum="+obj.sum(a));
    System.err.println("avj="+obj.avg(a));
    System.err.println("max="+obj.max(a));
    System.err.println("min="+obj.min(a));

   }
}
