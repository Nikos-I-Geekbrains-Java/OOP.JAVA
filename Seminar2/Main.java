package Seminar2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cat("Муська", 1, "рыжая"));
        zoo.addAnimal(new Duck("Дональд", 2));
        zoo.addAnimal(new Goose("Мартин", 3));
        zoo.addAnimal(new Horse("Буян", 4));

        System.out.println("\nГолосящие животные\n");
        ArrayList<Speakable> result = (ArrayList<Speakable>) zoo.getSpeakables();
        result.forEach(s -> System.out.print(s + ", голосит " + s.say() + "\n"));

        System.out.println("\nЛетающие животные\n");
        ArrayList<Flyable> flyResult = (ArrayList<Flyable>) zoo.getFlyers();
        flyResult.forEach(s -> System.out.print(s + ", скорость полета " + s.speedOfFly() + "\n"));

        System.out.println("\nПлавающие животные\n");
        ArrayList<Swimmable> swmResult = (ArrayList<Swimmable>) zoo.getSwimmable();
        swmResult.forEach(s -> System.out.print(s + ", скорость плавания " + s.speedOfSwimming() + "\n"));

        System.out.println("\nБегающие животные\n");
        ArrayList<Runable> runResult = (ArrayList<Runable>) zoo.getRunner();
        runResult.forEach(s -> System.out.print(s + ", скорость бега " + s.speedOfRun() + "\n"));

        System.out.println("\nСкорость чемпиона по бегу");
        int runChemp = zoo.getChampionOfRunners();
        System.out.printf("%d", runChemp);


    }
}
