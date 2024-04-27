package inheritance.Question5;

public class Cars extends Vehicles {

     Cars(String make, String model, int year, String fueltype) {
          super(make, model, year, fueltype);
     }

     public static void main(String[] args) {
          Cars cars = new Cars("Jaguar", "F-type", 2023, "petrol");
          cars.display();
          System.out.println(cars.distancetraveled(100,210));
          System.out.println(cars.fuelefficiency(500,550));
          System.out.println(cars.maximumspeed(300,700));
     }
}

