import java.util.Scanner;
import java.util.Stack;

public class P46_InfixToPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        String polish = "";
        String ans = "";

        Stack<Character> st = new Stack<Character>();
        int top = 0;
        st.push('(');
        top++;
        int rank = 0;
        int index = str.length()-1;

        char temp = str.charAt(index);

        while(temp != ' ')
        {
            if(temp == '(')
            {
                temp = ')';
            }
            else if(temp == ')')
            {
                temp = '(';
            }

            
            if(top < 1)
            {
                System.out.println("Invalid String with top");
                return;
            }

            while(G(st.peek()) > F(temp))
            {
                char t = st.pop();
                top--;
                polish += t;

                rank += R(t);

                if(rank < 1)
                {
                    System.out.println("Invalid String with rank");
                    return;
                }
            }

            if(G(st.peek()) != F(temp))
            {
                st.push(temp);
                top++;
            }
            else
            {
                st.pop();
                top--;
            }
            index--;

            temp = str.charAt(index);
        }

        while(top > 1)
        {
            char t = st.pop();
            polish += t;
            top--;

            rank += R(t);
        }

        for(int i=polish.length()-1;i>=0;i--)
        {
            ans += polish.charAt(i);
        }

        if( top != 1 || rank != 1)
        {
            System.out.println("Invalid String with top and rank");
        }
        else
        {
            System.out.println("Valid String");
            System.out.println("String : " + ans);
        }
    }

    public static int F(char temp)
    {

        switch(temp)
        {
            case '+' :
            case '-' :
                return 1;
            case '*' :
            case '/' :
                return 3;
            case '^' :
                return 6;
            case '(' :
                return 9;
            case ')' :
                return 0;
        }

        return 7;
    }

    public static int G(char temp)
    {

        switch(temp)
        {
            case '+' :
            case '-' :
                return 2;
            case '*' :
            case '/' :
                return 4;
            case '^' :
                return 5;
            case '(' :
                return 0;
        }

        return 8;
    }

    public static int R(char temp)
    {

        switch(temp)
        {
            case '+' :
            case '-' :
                return -1;
            case '*' :
            case '/' :
                return -1;
            case '^' :
                return -1;
            case '(' :
                return 0;
            case ')' : 
                return 0;
        }

        return 1;
    }
}