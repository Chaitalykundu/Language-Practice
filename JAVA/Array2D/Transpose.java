package Array2D;
import java.util.*;

public class Transpose {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row and column : ");
        int row = sc.nextInt();
        int column = sc.nextInt();

        int a[][] = new int[row][column];

            // Input
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
                a[i][j] = sc.nextInt();
        }

        System.out.println("Original matrix : ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }

        System.out.println("Transpose of the matrix : ");
        for(int i=0;i<column;i++)
        {
            for(int j=0;j<row;j++)
                System.out.print(a[j][i] + " ");
            System.out.println();
        }
    }
}
