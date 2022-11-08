package Basic;

import java.util.*;

class fibonacciRecursion{

    static int a = 0, b = 1, c;
    static void fibonacci(int n){

        if(n>=1){
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;

            fibonacci(n-1);
        }
    }
    public static void main(String[] args){;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms : ");
        int n = sc.nextInt();

        fibonacci(n);
    }

}