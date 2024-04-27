package inheritance.Question5;

public class Vehicles {

    String make;
    String model;
    int year;
    String fueltype;

    Vehicles(String make, String model, int year, String fueltype) {
        this.fueltype = fueltype;
        this.model = model;
        this.year = year;
        this.make = make;
    }

    public double fuelefficiency(double miles, double gallon) {
        return miles / gallon;

    }

    public double distancetraveled(double speed, double time){
        return speed*time;
    }
    public double maximumspeed(double horsepower, double weight){
        return (horsepower*2)/weight;
    }

    public static void main(String[] args) {

        Vehicles vehicle = new Vehicles("Ford","F-150",2000,"Petrol");
        vehicle.display();
        System.out.println(vehicle.fuelefficiency(400,25));
        System.out.println(vehicle.distancetraveled(100,50));
        System.out.println(vehicle.maximumspeed(120,600));


    }

    public void display(){
        System.out.println(make);
        System.out.println(model);
        System.out.println(year);
        System.out.println(fueltype);
    }

}
