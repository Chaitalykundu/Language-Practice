package Questions.InputOutput;

import java.util.*;

public class AreaAndPerimeterOfACircle {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the radius : ");
    float r = sc.nextFloat();
    double area = 3.14 * r * r;
    double perimeter = 2 * 3.14 * r;

    System.out.println("Area is " + area);
    System.out.println("Perimeter is " + perimeter);
    }
}
