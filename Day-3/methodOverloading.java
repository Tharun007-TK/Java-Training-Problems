class Employee2 {
    int empid;
    String name;
    int salary;
    int age;
    Employee2(int empid, String name, int salary, int age) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
    public Employee2() {
        System.out.println("Employee Created");
    }
    void display() {
        System.out.println("---------X----------");
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Age: " + age);
        System.out.println("---------X----------");
    }
    void fun(int a) {
        System.out.println("Value of A: "+a);
    }
}

class Developer1 extends Employee1 {
    public Developer1() {
        System.out.println("Developer Created");
    }
    void calpay() {        // Over riding method
        this.salary = this.salary+1500;
    }
}

public class Day3_inherit2 {
    public static void main(String[] args) {
        Developer1 developer = new Developer1();
        Employee2 emp2 = new Employee2();
        developer.salary = 150000;
        developer.calpay();
        System.out.println("Developer Salary: " + developer.salary);
        emp2.fun(2);
    }
}
