package Function;
import java.util.*;

public class EvenOdd {
    public static int checkEvenOdd(int n) {

        if(n%2==0)
            return 1;
        else
            return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");

        int n = sc.nextInt();

        int check = checkEvenOdd(n);
        if(check==1)
            System.out.println("Even");
        else
        System.out.println("Odd");
    }
}