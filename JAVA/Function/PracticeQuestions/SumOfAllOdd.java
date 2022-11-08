package Function.PracticeQuestions;
import java.util.*;

public class SumOfAllOdd {
    public static int SumofOdd(int n) {

        int sum = 0;

        for(int i=1;i<=n;i=i+2)
        {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms : ");

        int n = sc.nextInt();

        int sum = SumofOdd(n);

        System.out.println(sum);
    }
}

