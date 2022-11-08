package SwitchCase;
import java.util.*;

public class Calcuulator {
    public static void main(String [] args) {
        System.out.print("Enter a choice : ");
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        int a = sc.nextInt();
        int b =sc.nextInt();

        switch(choice){
            case 1:
                int sum = a + b;
                System.out.println("Sum is " + sum);
                break;
            case 2:
                int sub = a - b;
                System.out.println("Subtraction is " + sub);
                break;
            case 3:
                int mult = a * b;
                System.out.println("Multiplication is " + mult);
                break;
            case 4:
                int divi = a / b;
                System.out.println("Division is " + divi);
                break;
            case 5:
                int modulo = a % b;
                System.out.println("Remainder is " + modulo);
                break;
            default:
                System.out.println("Enter valid choice");
        }
    }
}
