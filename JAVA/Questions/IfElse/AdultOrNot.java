/* Author : Chaitaly Kundu
   Date : 20-09-2021*/

package Questions.IfElse;

import java.util.*;

public class AdultOrNot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>=18)
            System.out.println("Adult");
        else
            System.out.println("Not adult");
    }
}