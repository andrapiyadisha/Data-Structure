import java.util.Scanner;

public class Q25 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number of Array: ");
    int n = sc.nextInt();
    int[] a = new int[n];
    System.out.println("Enter a Array: ");
    for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
    }
    System.out.println("Display Array is: ");
    for(int i=0;i<n;i++){
        System.out.println(a[i]);
    }

    int[] finl = new int[n];
    int temp = 0;
    System.out.println("Deleted Dublicat Array is: ");
    for(int i=1;i<n;i++){
       boolean isDub = false;
       for(int j=0;j<temp;j++){
        if(a[i]==finl[j]){
            isDub = true;
            break;
        }
       }
       if(!isDub){
        finl[temp] = a[i];
        temp++;
       }
    }
    for(int i=0;i<temp;i++){
        System.out.println(finl[i]);
    }
 }
}
