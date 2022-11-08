/* Author : Chaitaly Kundu
   Date : 20-09-2021*/

package Questions.IfElse;

import java.util.*;

public class EvenOrOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");

        int number = sc.nextInt();

        if(number%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}