package Function.PracticeQuestions;

import java.util.Scanner;

public class circumferenceOfaCircle {
    public static void main(String[] args) {
        System.out.print("Enter the radius : ");

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        double circumference = 2 * 3.14 * r;
        System.out.println("Circumference of the circle = " + circumference);
    }
}
