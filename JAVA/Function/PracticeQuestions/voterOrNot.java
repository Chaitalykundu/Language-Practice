package Function.PracticeQuestions;
import java.util.*;

public class voterOrNot {
    public static void main(String [] args){

        System.out.print("Enter two numbers : ");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>=18)
            System.out.println("Voter");
        else
            System.out.println("Not Voter");

    }
}