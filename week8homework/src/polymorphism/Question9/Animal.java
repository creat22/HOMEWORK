package polymorphism.Question9;
/*Write a Java program to create a base class Animal with methods move() and makeSound().
Create two subclasses Bird and Panthera. Override the move()
method in each subclass to describe how each animal moves. Also, override the makeSound()
method in each subclass to make a specific sound for each animal.*/
public class Animal {

    String animalName;
    String move;
    String sound;

    public Animal(String animalName, String move, String sound) {
        this.animalName = animalName;
        this.move = move;
        this.sound = sound;
    }

    public void move(){
        System.out.println(animalName +" runs "+move);
    }
    public void makesound(){
        System.out.println(animalName + " makes a sound of " +sound);
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Tiger","fast","roar");
        animal.move();
        animal.makesound();
    }
}
