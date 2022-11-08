/* Author : Chaitaly Kundu
   Date : 21-09-2021*/

   package Patterns.Stars;
   import java.util.*;

public class HollowRectangle {
    public static void main(String[] args){
        System.out.print("Enter the number of rows and columns : ");
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int column = sc.nextInt();

        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=column;j++)
            {
                if(i==1 || i==row)
                    System.out.print("* ");
                else if(j==1 || j==column)
                    System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.print("\n");
        }
    }
}
