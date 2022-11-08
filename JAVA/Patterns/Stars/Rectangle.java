/* Author : Chaitaly Kundu
   Date : 21-09-2021*/

   package Patterns.Stars;
   import java.util.*;

public class Rectangle{
    public static void main(String[] args) {
        System.out.print("Enter the number of rows and columns : ");
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int column = sc.nextInt();

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
                System.out.print("* ");
            System.out.print("\n");
        }
    }
}


/*

Rectangle

* * * *
* * * *
* * * *
* * * *

*/