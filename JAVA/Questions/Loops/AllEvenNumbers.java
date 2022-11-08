package Questions.Loops;
import java.util.*;

public class AllEvenNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms : ");
        int n = sc.nextInt();

        for(int i=2;i<=n;i=i+2)
            System.out.print(i + " ");
    }
}
