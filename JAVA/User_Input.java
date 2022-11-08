import java.util.*;

class User_Input {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);  // System input

        // Input a string
        System.out.println("Enter the string");
        String name = sc.next();
        System.out.println(name);


            // Input a line
        System.out.println("Enter the line");
        Scanner scl = new Scanner(System.in);
        String line = scl.nextLine();
        System.out.println(line);


            // Input an integer
        System.out.println("Enter the age");
        int age = sc.nextInt();
        System.out.println(age);

            // Input a float
        System.out.println("Enter the mark");
        float mark = sc.nextFloat();
        System.out.println(mark);
    }
}