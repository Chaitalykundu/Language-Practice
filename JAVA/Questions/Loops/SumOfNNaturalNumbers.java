/* Author : Chaitaly Kundu
   Date : 20-09-2021*/

   package Questions.Loops;

   import java.util.*;

   public class SumOfNNaturalNumbers{
       public static void main(String[] args){
           Scanner sc = new Scanner(System.in);

           System.out.print("Enter the number of terms : ");
           int n = sc.nextInt();

           int sum = 0;
           for(int i=1;i<=n;i++)
               sum = sum + i;
           System.out.print(sum);
       }
   }