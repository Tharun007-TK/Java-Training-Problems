abstract class Employee5 {

    int id;
    String name, role;
    int salary;
    int age;

    Employee5(int id, String name, int salary, int age, String role) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.role = role;
    }

    void display() {
        System.out.println("\t Employee Details");
        System.out.println("---------X----------");
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Role: " + role);
        System.out.println("---------X----------");
        System.out.println("\n");
    }

    void calpay() {

       this.salary = this.salary+25000;
    }
}

class Developer4 extends Employee5 {

    Developer4(int id, String name, int salary, int age, String role) {

        super(id, name, salary, age, role);
    }

    void displayDev() {
        System.out.println("\t Developer Details");
        System.out.println("---------X----------");
        System.out.println("Developer ID: " + id);
        System.out.println("Developer Name: " + name);
        System.out.println("Developer Salary: " + salary);
        System.out.println("Developer Age: " + age);
        System.out.println("Developer Role: " + role);
        System.out.println("---------X----------");
        System.out.println("\n");
    }

    void calpayDev() {

        this.salary = this.salary+25000;
    }
}

class HR extends Employee5 {
    HR(int id, String name, int salary, int age, String role) {

        super(id, name, salary, age, role);
    }

    void displayHR() {
        System.out.println("\t HR Details");
        System.out.println("---------X----------");
        System.out.println("HR ID: " + id);
        System.out.println("HR Name: " + name);
        System.out.println("HR Salary: " + salary);
        System.out.println("HR Age: " + age);
        System.out.println("HR Role: " + role);
        System.out.println("---------X----------");
        System.out.println("\n");
    }

    void calpayHR() {
        this.salary = this.salary+25000;
    }
}

class Accountant extends Employee5 {
    Accountant(int id, String name, int salary, int age, String role) {

        super(id, name, salary, age, role);
    }
    void displayAcc() {
        System.out.println("\t Accountant Details");
        System.out.println("---------X----------");
        System.out.println("Accountant ID: " + id);
        System.out.println("Accountant Name: " + name);
        System.out.println("Accountant Salary: " + salary);
        System.out.println("Accountant Age: " + age);
        System.out.println("Accountant Role: " + role);
        System.out.println("---------X----------");
        System.out.println("\n");
    }

    void calpayAcc() {

        this.salary = this.salary+25000;
    }
}

public class Day3_abstract1 {
    public static void main(String[] args) {
        //Employee5 emp = new Employee5(125, "Laksita", 250000, 20, "Developer");
        Developer4 d = new Developer4(46, "Tharun Kumar", 350000, 20, "Designer");
        HR hr = new HR(125, "Laksita", 450000, 20, "HR Manager");
        Accountant acc = new Accountant(60, "Rahul", 270000, 23, "Accountant");

        d.displayDev();
        d.calpayDev();
        d.displayDev();

        hr.displayHR();
        hr.calpayHR();
        hr.displayHR();

        acc.displayAcc();
        acc.calpayAcc();
        acc.displayAcc();

    }
}
