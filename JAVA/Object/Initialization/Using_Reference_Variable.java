package Object.Initialization;

public class Using_Reference_Variable {
    int a , b;  // Reference variables

    public static void main(String[] args) {
        Using_Reference_Variable add = new Using_Reference_Variable();

        add.a = 5;
        add.b = 9;
        int res = add.a + add.b;

        System.out.println("Sum of " + add.a  + " and " +  add.b + " is " + res);
    }
}
