package polymorphism.Question6;

/*Write a Java program to create a base class Animal (Animal Family) with a method called Sound().
Create two subclasses Bird and Cat.
Override the Sound() method in each subclass to make a specific sound for each animal.*/

public class Animal {

    public void sound(){

        System.out.println("Birds are chirping");
    }

    public static void main(String[] args) {
        Animal sing = new Animal();
        sing.sound();
    }
}
