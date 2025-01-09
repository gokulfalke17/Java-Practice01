package company.programming.test;

public class Employee {

    private int id;
    private String name;
    private String designation;
    private double salary;


    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }


    public void displayDetails() {
        System.out.println("Employee ID :: "+ id);
        System.out.println("Name :: "+ name);
        System.out.println("Designation :: "+ designation);
        System.out.println("Base Salary :: "+ salary);
    }


    public void applyBonus(String rating) {
        double perBonus = 0.0;

        switch (rating.toLowerCase()) {
            case "excellent":
                perBonus = 0.20; 
                break;
            case "good":
                perBonus = 0.10;
                break;
            case "average":
                perBonus = 0.05; 
                break;
            default:
                System.out.println("Invalid performance rating. No bonus applied.");
                return; 
        }


        double bonusSalary = salary * perBonus;
        salary = salary + bonusSalary;
        System.out.println("Bonus Applied :: "+ bonusSalary);
        System.out.println("Updated Salary :: "+ salary);
    }


    public static void main(String[] args) {

        Employee emp1 = new Employee(101, "karan", "Software Engineer", 50000);


        emp1.displayDetails();


        emp1.applyBonus("good"); 
    }
}
