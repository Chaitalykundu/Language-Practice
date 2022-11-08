package Array;
import java.util.*;

public class DefiningArray {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();

        System.out.println("Enter the elements : ");
        int marks[] = new int[n];

        for(int i=0;i<n;i++)
            marks[i] = sc.nextInt();

        System.out.println("Entered elements are : ");
        for(int i=0;i<n;i++)
            System.out.print(marks[i] + " ");
    }
}
