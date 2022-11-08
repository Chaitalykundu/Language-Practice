package Function;
import java.util.*;

public class SumOfTwoNumbers {

    public static int sumOfTwo(int a, int b) {
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers : ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = sumOfTwo(a, b);
        System.out.println("Sum of " + a + " and " + b + " is " + sum);

    }
}
