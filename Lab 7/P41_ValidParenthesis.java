import java.util.Scanner;

public class P41_ValidParenthesis{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total test case : ");
        int t = sc.nextInt();
        int[] output = new int[t];
        sc.nextLine();


        for(int i=0;i<t;i++)
        {
            System.out.println("Enter String : ");
            String str1 = sc.nextLine();
            StringBuilder str = new StringBuilder(str1);
            Boolean ans = true;

            int round_b = 0;
            int square_b = 0;
            int curly_b = 0;

            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(j) == ']')
                {
                    int temp = j-1;
                    while(temp >= 0)
                    {
                        if(str.charAt(temp) == '[')
                        {
                            ans  = true;
                            str.setCharAt(temp, '0');
                            str.setCharAt(j, '0');
                            break;
                        }
                        else if(str.charAt(temp) == '0')
                        {
                            temp--;
                        }
                        else
                        {
                            ans = false;
                            break;
                        }
                    }
                }
                else if(str.charAt(j) == ')')
                {
                    int temp = j-1;
                    while(temp >= 0)
                    {
                        if(str.charAt(temp) == '(')
                        {
                            ans  = true;
                            str.setCharAt(temp, '0');
                            str.setCharAt(j, '0');
                            break;
                        }
                        else if(str.charAt(temp) == '0')
                        {
                            temp--;
                        }
                        else
                        {
                            ans = false;
                            break;
                        }
                    }
                }
                else if(str.charAt(j) == '}')
                {
                    int temp = j-1;
                    while(temp >= 0)
                    {
                        if(str.charAt(temp) == '{')
                        {
                            ans  = true;
                            str.setCharAt(temp, '0');
                            str.setCharAt(j, '0');
                            break;
                        }
                        else if(str.charAt(temp) == '0')
                        {
                            temp--;
                        }
                        else
                        {
                            ans = false;
                            break;
                        }
                    }
                }
            }

            if(ans == true && str.length()%2 == 0 )
                {
                    output[i] = 1;
                }
                else
                {
                    output[i] = 0;
                }
            
        }

        for(int i=0;i<t;i++)
        {
            System.out.print( output[i] + " ");
        }

    }
}