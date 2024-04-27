package inheritance.Question5;

public class Motorcycle extends Vehicles {

    Motorcycle(String make, String model, int year, String fueltype) {
        super(make, model, year, fueltype);
    }

    public static void main(String[] args) {
        Motorcycle motor = new Motorcycle("Honda","YK02", 2002, "Petrol" );
        motor.display();
        System.out.println(motor.distancetraveled(60,120));
        System.out.println(motor.fuelefficiency(100,120));
        System.out.println(motor.maximumspeed(120,500));
    }
}
