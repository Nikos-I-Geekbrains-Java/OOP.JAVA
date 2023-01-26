package Seminar2;

public class Horse extends Animal implements Runable{

    public Horse(String name, int box) {
        super(name, box);
    }

    @Override
    public String say() {
        return "Иго-го-го";
    }

    @Override
    public String toString() {
        return "Лошадь: " + super.toString();
    }

    @Override
    public int speedOfRun() {
        return 60;
    }
}
