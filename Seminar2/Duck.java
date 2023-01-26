package Seminar2;

public class Duck extends Animal implements Runable, Flyable, Swimmable {

    public Duck(String name, int box) {

        super(name, box);
    }

    @Override
    public String say() {
        return "Кря-кря";
    }

    @Override
    public int speedOfFly() {
        return 40;
    }

    @Override
    public String toString() {
        return "Утка: " + super.toString();
    }

    @Override
    public int speedOfRun() {
        return 10;
    }

    @Override
    public int speedOfSwimming() {return 8;}
}

