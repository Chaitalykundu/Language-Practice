package Patterns.Advance;
import java.util.*;

public class NumberPyramid {
    public static void main(String[] args)
    {
        System.out.print("Enter the number of rows : ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            int space = n-i;
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++)
                System.out.print(i + " ");

            System.out.println();
        }
    }
}


/*

Enter the number of rows : 5
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5

*/