package Array2D;
import java.util.*;

public class DefineUserInput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row and column : ");
        int row = sc.nextInt();
        int column = sc.nextInt();

        int marks[][] = new int[row][column];


            // Input
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
                marks[i][j] = sc.nextInt();
        }

            // Display
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
                System.out.print(marks[i][j] + " ");
            System.out.println();

        }
    }
}
