//equality checking...

package Lab4_Inheritence;
import java.util.Scanner; //don't worry. This line is created itself.

public class labClassFour_Equality_Checking
{
    public static void main(String[] args)
    {
        //checking whether two strings are same or not...
        String passWord = "darkwarrior7";

        System.out.println("enter your password : ");
        Scanner sc = new Scanner(System.in);
        String pass =  sc.nextLine(); //next() is for a word; nextLine() is for a whole line

        System.out.println(pass);
        if (pass.equals(passWord)) //passWord.equals(pass) both are the same
            System.out.println("correct password");
        else
            System.out.println("invalid password");

        // or
        System.out.println("your given password is : " + pass.equals(passWord)); //this gets checked here/

        //checking whether two integers are same...
        int a = 4;
        int b = 4;
        System.out.println("a == b is : " + (a==b)); //if-else is time-consuming

        //checking whether two characters are same or not...
        char ch = 'A';
        char ch2 = 'a';
        System.out.println("ch == ch2 is : " + (ch==ch2));
    }
}
