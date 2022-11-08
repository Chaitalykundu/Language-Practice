package Function.PracticeQuestions;
import java.util.*;

public class AverageOfThreeNumber {
    public static float average(int a, int b, int c) {
        int sum = a + b + c;
        float avg = (sum/3);
        return avg;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers : ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        float avg = average(a,b,c);

        System.out.println(avg);
    }
}
