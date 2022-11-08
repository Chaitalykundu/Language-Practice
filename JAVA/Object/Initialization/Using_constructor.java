package Object.Initialization;

public class Using_constructor {
    String name;
    int emp_id;
    public Using_constructor(String name, int emp_id)
    {
        this.name = name;
        this.emp_id = emp_id;
    }

    public static void main(String[] args) {
        Using_constructor e1 = new Using_constructor("Deepak", 101);
        Using_constructor e2 = new Using_constructor("Rupak", 102);
        System.out.println("Employee Name " + e1.name + "ID " + e1.emp_id);
        System.out.println("Employee Name " + e2.name + "ID " + e2.emp_id);
    }
}
