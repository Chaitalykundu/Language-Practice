/* Author : Chaitaly Kundu
   Date : 20-09-2021*/

package Questions.Loops;

import java.util.*;

public class PrintNNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
            System.out.print(i + " ");
    }
}