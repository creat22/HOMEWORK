package inheritance.Question4;

public class Cheetah extends Animal {

    @Override
    public void move() {
        System.out.println("Cheetah runs faster");
    }

    public static void main(String[] args) {
        Cheetah chee = new Cheetah();
        chee.move();}
}
