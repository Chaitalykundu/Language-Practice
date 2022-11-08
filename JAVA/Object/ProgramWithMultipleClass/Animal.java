package Object.ProgramWithMultipleClass;


public class Animal {
    public void eat()   // method
    {
        System.out.println("I'm eating");
    }
    public void run()   // method
    {
        System.out.println("I'm running");
    }

        // main function
    public static void main(String[] args)
    {
        System.out.println("I'm main function");

        // creating object
        Animal cat = new Animal();
        cat.run();  // calling run method

        // creating another object
        Bird parrot = new Bird();
        parrot.fly(); // calling fly method
    }
}


// Another class
class Bird{
    public void fly()   // method
    {
        System.out.println("I'm flying");
    }
}



/* Run the code javac -d . Animal.java
java Object.ProgramWithMultipleClass.Animal */