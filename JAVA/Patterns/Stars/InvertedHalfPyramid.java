package Patterns.Stars;
import java.util.*;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows : ");
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();

        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=row-i+1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


/* Another

for(int i=row;i>=1;i--)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print("* ");
    }
    System.out.println();
}

*/

/*

Half Pyramid: if row = 4

* * * *
* * *
* *
*


*/