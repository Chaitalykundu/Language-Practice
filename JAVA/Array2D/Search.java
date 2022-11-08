package Array2D;
import java.util.*;

public class Search {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row and column : ");
        int row = sc.nextInt();
        int column = sc.nextInt();

        int marks[][] = new int[row][column];

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
                marks[i][j] = sc.nextInt();
        }

            // Searched element
        int x = sc.nextInt();

            // Display

        int c=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
            {
                if(marks[i][j] == x)
                {
                    c++;
                    System.out.println("Element found in " + "( " + i + "," + j + " ) index");
                }
            }
        }
        if(c==0)
            System.out.println("Element not found");
    }
}
