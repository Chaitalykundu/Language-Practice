package Object.Initialization;

public class Using_method {
    void add(int a, int b)  // method
    {
        int res = a + b;
        System.out.println("Sum is " + res);
    }
    public static void main(String[] args) {
        Using_method addition = new Using_method();

        addition.add(10,15);
    }
}
