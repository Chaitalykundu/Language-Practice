package Constructor;
//import java.io.*;

class Default {
    int n;
    String name;

    Default()
    {
        System.out.println("Constructor called");
    }
}

class Program {
    public static void main(String[] args){
        Default e1 = new Default();
        System.out.println(e1.n);
        System.out.println(e1.name);
    }
}
