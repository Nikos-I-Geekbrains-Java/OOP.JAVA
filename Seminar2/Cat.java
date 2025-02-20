package Seminar2;

public class Cat extends Animal implements Runable{

    private String color;

    public Cat(String name, int box, String color) {
        super(name, box);
        this.color = color;
    }
    @Override
    public String say() {
        return "Мяу";
    }

    @Override
    public String toString() {
        return "Кошка: " + super.toString() + ", цвет " + this.color;
    }
    @Override
    public int speedOfRun() {
        return 15;
    }


}
