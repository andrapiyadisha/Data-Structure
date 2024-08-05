import java.util.Scanner;

public class P44_VowelAnxiety {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total test case : ");
        int t = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<t;i++)
        {
            System.out.println("Enter String : ");
            String str = sc.nextLine();
            String ans = "";
            String temp = "";

            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(j) == 'a' || str.charAt(j) == 'e' || str.charAt(j) == 'i' || str.charAt(j) == 'o' || str.charAt(j) == 'u')
                {
                    ans = "";
                    for(int k=j-1;k>=0;k--)
                    {
                        ans += temp.charAt(k);
                    }

                    ans += str.charAt(j);
                    temp = ans;
                }
                else
                {
                    temp += str.charAt(j);
                }
            }

            if(str.charAt(str.length()-1) == 'a' || str.charAt(str.length()-1) == 'e' || str.charAt(str.length()-1) == 'i' || str.charAt(str.length()-1) == 'o' || str.charAt(str.length()-1) == 'u')
            {}
            else
            {
                ans += str.charAt(str.length()-1);
            }

            System.out.println(ans);
        }
    }
}