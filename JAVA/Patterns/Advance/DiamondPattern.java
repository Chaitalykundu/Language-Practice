package Patterns.Advance;
import java.util.*;

public class DiamondPattern {
    public static void main(String[] args)
    {
        System.out.print("Enter the number of rows : ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            int space = n-i;
            for(int j=1;j<=space;j++)
                System.out.print("  ");

            for(int j=1;j<=2*i-1;j++)
                System.out.print("* ");

            System.out.println();
        }

        for(int i=n;i>=1;i--)
        {
            int space = n-i;
            for(int j=1;j<=space;j++)
                System.out.print("  ");

            for(int j=1;j<=2*i-1;j++)
                System.out.print("* ");

            System.out.println();
        }
    }
}

/*

Enter the number of rows : 5
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *

*/