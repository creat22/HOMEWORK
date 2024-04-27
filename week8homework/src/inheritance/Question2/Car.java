package inheritance.Question2;

/*Write a Java program to create a class called Vehicle with a method called drive().
Create a subclass called Car that overrides the drive() method to print "Repairing a car".*/

public class Car extends Vehicle {

    public void drive(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.drive("Repairing a car");
    }
}
