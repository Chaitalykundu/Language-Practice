/* Author : Chaitaly Kundu
   Date : 20-09-2021*/

   package Questions.IfElse;

   import java.util.*;

   public class PrintTheGreeting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");

        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Hi");
                break;
            default:
                System.out.println("Invalid number");

        }
   }
}