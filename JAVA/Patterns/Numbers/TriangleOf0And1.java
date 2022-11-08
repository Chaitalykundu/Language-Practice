package Patterns.Numbers;

import java.util.*;

public class TriangleOf0And1 {
    public static void main(String[] args)
    {
        System.out.print("Enter the number of rows : ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i%2!=0 && j%2==0)|| (i%2==0 && j%2!=0))
                    System.out.print("0 ");
                else
                    System.out.print("1 ");
            }
            System.out.println();
        }
    }
}



/*

Enter the number of rows : 5
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

*/