package polymorphism.Question8;

/*Write a Java program to create a class Employee with a method called calculateSalary().
Create two subclasses Manager and Programmer. In each subclass, override the calculateSalary()
method to calculate and return the salary based on their specific roles.*/
public class Employee {



    public void calculatesalary(String name,int salary){
        System.out.println(name+" "+salary);
    }

    public static void main(String[] args) {
        Employee salary = new Employee();
        salary.calculatesalary("Janki",50000);
    }

}
