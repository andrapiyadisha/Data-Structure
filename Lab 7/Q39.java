import java.util.Scanner;
class StackString{
       int top = -1;
       int n;
       int[] a;

       StackString(int n){
        this.n = n;
        a = new int[n];
       }

       void push(int x){
        if(top>=(n-1)){
           System.out.println("Stack Overflow");
        } else {
           top++;
           a[top] = x;
          // System.out.println("Element is push successfully");
        }
        return;
       }
   
       int pop(){
           if(top == -1){
               return -1;
           } else {
               top--;
               return a[top + 1];
           }
       }
}
public class Q39 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      System.out.println("Enter a String with one space at end: ");
      String s = sc.nextLine();
      StackString st = new StackString(s.length());
      int index = 0;
      for(int i=0;i<s.length();i++){
        if(s.charAt(i) == 'c'){
            index = i;
            break;
        }else{
            st.push(s.charAt(i));
        }
      }
      boolean found = true;

      for(int i=index+1;i<s.length()-1;i++){
        if(s.charAt(i)!=st.pop()){
            found = false;
            break;
        }
      }
      if(!found){
        System.out.println("Invalid");
      } else {
        System.out.println("Valid");
      }
      
    }
}