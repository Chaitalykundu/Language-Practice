package Function;
import java.util.*;

public class Factorial {
    public static int factorialCalculate(int n) {

        if(n<0)
            return -1;
        int fact = 1;
        for(int i=1;i<=n;i++)
            fact*=i;
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");

        int n = sc.nextInt();

        int Factorial = factorialCalculate(n);
        System.out.println("Factorial of " + n + " is : " + Factorial);
    }
}