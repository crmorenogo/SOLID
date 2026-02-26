public class Bird extends Animal implements Flyable {

    @Override
    public void makeSound() {
        IO.println("The cat sings");
    }

    @Override
    public void fly() {
        IO.println("The bird flies");
    }

}