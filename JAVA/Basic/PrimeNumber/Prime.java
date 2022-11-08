package Basic.PrimeNumber;

import java.util.*;
 
public class Prime{

    static int prime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int res = prime(n);
        if(res==1)
            System.out.println( n + " is Prime number");
        else
            System.out.println(n + " is not Prime number");
    }
}

/*
Compile : javac -d . Prime.java
run : java Basic.PrimeNumber.Prime

*/