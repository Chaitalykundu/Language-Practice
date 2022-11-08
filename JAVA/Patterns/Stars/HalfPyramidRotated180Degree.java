package Patterns.Stars;
import java.util.*;

public class HalfPyramidRotated180Degree {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows : ");
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();

        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=row;j++)
            {
                if(j<row-i+1)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}


/*

Half Pyramid Rotated by 180 degree
Enter the number of rows : 4
      *
    * *
  * * *
* * * *

*/