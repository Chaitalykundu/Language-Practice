package Questions.Loops;
import java.util.*;

public class Marks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms : ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter score : ");
                int score = sc.nextInt();

                if(score>=90)
                    System.out.println("This is Good");
                else if(score<90 && score >=60)
                    System.out.println("This is also Good");
                else
                    System.out.println("This is Good as well");
                break;
            case 0:
                break;
            default:
                System.out.println("Please enter valid number");
        }
    }
}
