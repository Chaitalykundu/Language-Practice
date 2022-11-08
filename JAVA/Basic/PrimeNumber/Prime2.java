package Basic.PrimeNumber;
import java.util.*;

public class Prime2 {
    static int primeNum(int n) {
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int res = primeNum(n);
        if(res==1)
            System.out.println( n + " is Prime number");
        else
            System.out.println(n + " is not a Prime number");
    }
}

/*
Compile : javac -d . Prime2.java
run : java Basic.PrimeNumber.Prime2

*/