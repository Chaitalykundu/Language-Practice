package Function;
import java.util.*;

public class PrimeOrNot {
    public static int checkPrime(int n) {

        if(n<=1)
            return 0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");

        int n = sc.nextInt();

        int prime = checkPrime(n);
        if(prime==1)
            System.out.println("Prime");
        else
        System.out.println("Not Prime");
    }
}