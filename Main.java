class Person {

    String name;
    int age;

    void introduce() {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
    }
}

class Employee extends Person {

    int salary;

    void showSalary() {
        System.out.println("Salary is " + salary);
    }
}

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee();
        Person p =new Person();
        p.name = "samir";
        p.age = 30;
        employee.name = "Ashish";
        employee.age = 25;
        employee.salary = 50000;


        p.introduce();
        employee.introduce();
        employee.showSalary();
    }
}