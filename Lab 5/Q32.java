import java.util.Arrays;
import java.util.Scanner;
public class Q32 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of String");
        int n = sc.nextInt();
        System.out.println("Enter the Word: ");
        String[] a = new String[n];
        for(int i=0;i<n;i++){
            a[i] = sc.next();
        }
        for(int i=0;i<n;i++){
            System.out.println("Words= "+a[i]);
        }
        int randomNumber = (int)(Math.random()*n);
        String word = a[randomNumber];
        System.out.println("Ranom = "+word);
       
       
        System.out.println("Enter a Anagram: ");
        String a2 = sc.next();

        if(word.length()!=a2.length()){
            System.out.println("Not valid");
        }else{
                   
        char[] s1 = word.toCharArray();
        char[] s2 = a2.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);
           
        if(Arrays.equals(s1,s2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
        }
 
    }
}