package Function;
import java.util.*;

public class ProductOfTwoNmbers {
    public static int productCalculate(int a, int b) {
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers : ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = productCalculate(a, b);
        System.out.println("Product of " + a + " and " + b + " is " + product);
    }
}
