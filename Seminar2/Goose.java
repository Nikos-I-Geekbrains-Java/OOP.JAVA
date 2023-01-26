package Seminar2;

public class Goose extends Animal implements Runable, Flyable, Swimmable {

    public Goose(String name, int box) {
        super(name, box);
    }

    @Override
    public String toString() {
        return "Гусь: " + super.toString();
    }

    @Override
    public String say() {
        return "Га-га";
    }

    @Override
    public int speedOfFly() {
        return 50;
    }

    @Override
    public int speedOfRun() {
        return 20;
    }

    @Override
    public int speedOfSwimming() {
        return 10;
    }
}
