package inheritance.Question5;

public class Truck extends Vehicles {
    Truck(String make, String model, int year, String fueltype) {
        super(make, model, year, fueltype);
    }

    public static void main(String[] args) {
        Truck truck = new Truck("TATA","Telcoline",2022,"Diesel");
        truck.display();
        System.out.println(truck.distancetraveled(150,250));
        System.out.println(truck.fuelefficiency(50,120));
        System.out.println(truck.maximumspeed(100,700));


    }
}
