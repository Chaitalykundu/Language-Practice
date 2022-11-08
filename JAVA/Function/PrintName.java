package Function;
import java.util.*;

public class PrintName {


        // myName function
    public static void myName(String name)
    {
        System.out.println("My name is " + name);
        return;
    }

        // surname function
    public static void surname(){
        System.out.println("My surname is Kundu");
    }

    public static void main(String[] args)
    {
        System.out.print("Enter your name : ");

        Scanner sc = new Scanner(System.in);
        String name = sc.next();

            // myName function call
        myName(name);

            // surname function call
        surname();
    }
}
