package Lab3_Constructor;

import java.util.Scanner;

public class labClassThree_Scanner
{
    public static void main(String[] args)
    {
        int n;
        double d;
        String name;

        Scanner variableName = new Scanner(System.in);
        n = variableName.nextInt(); //to take int
        d = variableName.nextDouble(); //to take double
        name = variableName.nextLine(); //name = sc.next(); will take until space.

        System.out.println(n);
        System.out.println(d);
        System.out.println(name);

        //scanning and printing array...
        int []arr2 = new int[4];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<arr2.length; i++)
        {
            arr2[i] = sc.nextInt();
        }

        for(int x : arr2)
        {
            System.out.println(x);
        }
    }
}
