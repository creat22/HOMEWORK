package inheritance.Question2;

public class Vehicle {

    public void drive(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.drive("car");

    }

}
