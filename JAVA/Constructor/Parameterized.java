package Constructor;

public class Parameterized {
    int n;
    String name;

    Parameterized(int a, String nm){
        this.n = a;
        this.name = nm;
    }
}

class Start{
    public static void main(String [] args) {
        Parameterized e1 = new Parameterized(1,"Moni");
        Parameterized e2 = new Parameterized(2, "Chaitaly");
        Parameterized e3 = new Parameterized(3, "ankita");
        System.out.println("GeekName : " + e1.name + " and GeekId : " + e1.n);
        System.out.println("GeekName : " + e2.name + " and GeekId : " + e2.n);
        System.out.println("GeekName : " + e3.name + " and GeekId : " + e3.n);
    }
}
