package Function.PracticeQuestions;
import java.util.*;

public class GreaterBetweenTwo{
    public static void main(String [] args){

        System.out.print("Enter two numbers : ");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b)
            System.out.println("a is greater");
        else if(a<b)
            System.out.println("b is greater");

    }
}