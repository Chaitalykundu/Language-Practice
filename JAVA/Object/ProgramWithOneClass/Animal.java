package Object.ProgramWithOneClass;

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
    }
}
