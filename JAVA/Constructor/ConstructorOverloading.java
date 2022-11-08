package Constructor;

public class ConstructorOverloading {
    // int n;
    // String name;

    ConstructorOverloading(int a){
        System.out.println("Constructor with one argument : " + a);
    }

    ConstructorOverloading(int a, String nm){
        System.out.println("Constructor with two argument : " + a + " " + nm);
    }

    ConstructorOverloading(long p){
        System.out.println("Constructor with one argument but different parameter: " + p);
    }

}

class cons{
    public static void main(String [] args) {
        ConstructorOverloading e1 = new ConstructorOverloading(1);
        ConstructorOverloading e2 = new ConstructorOverloading(2, "Chaitaly");
        ConstructorOverloading e3 = new ConstructorOverloading(325614567);
    }
}


/* Output :

Constructor with one argument : 1
Constructor with two argument : 2 Chaitaly
Constructor with one argument : 325614567

*/
