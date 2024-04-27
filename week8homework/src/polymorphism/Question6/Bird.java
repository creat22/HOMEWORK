package polymorphism.Question6;

public class Bird {


    public void sound(){
        System.out.println("Bird chirps");
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.sound();
    }
}
