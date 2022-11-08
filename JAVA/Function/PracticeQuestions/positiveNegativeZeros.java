package Function.PracticeQuestions;
import java.util.*;

public class positiveNegativeZeros {

    public static void posNegZeros(int n) {

        int pos = 0, neg=0, zeros=0, d;

        while(n>0)
        {
            d = n % 10;
            if(d>0)
                pos++;
            else if(d<0)
                neg++;
            else
                zeros++;
            n/=10;
        }
        System.out.println("Positive = " + pos + "\nNegative = " + neg + "\nZeros " + zeros);
    }

    public static void main(String [] args){

        System.out.print("Enter two numbers : ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        posNegZeros(n);

    }
}