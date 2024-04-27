package polymorphism.Question7;

/* Write a Java program to create a class Vehicle with a method called speedUp().
 Create two subclasses Car and Bicycle.
Override the speedUp() method in each subclass to increase the vehicle's speed differently.*/
public class Vehicle {

    public void speedUp(int speed){
        System.out.println("Vehicle's speed:" +speed);
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.speedUp(20);

    }
}
