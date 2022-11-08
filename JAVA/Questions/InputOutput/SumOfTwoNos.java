package Questions.InputOutput;

import java.util.*;

public class SumOfTwoNos {
    public static void main(String [] args) {
        System.out.println("Enter the numbers : ");

        Scanner variable = new Scanner(System.in);
        int a = variable.nextInt();
        int b = variable.nextInt();

        int sum = a + b;
        System.out.println(sum);
    }
}
