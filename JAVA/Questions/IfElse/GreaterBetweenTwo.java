/* Author : Chaitaly Kundu
   Date : 20-09-2021*/

package Questions.IfElse;

import java.util.*;

public class GreaterBetweenTwo{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter two numbers : ");

            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a == b)
                System.out.println("Equal");
            else if(a>b)
                System.out.println("a is greater");
            else
                System.out.println("b is greater");
        }
   }