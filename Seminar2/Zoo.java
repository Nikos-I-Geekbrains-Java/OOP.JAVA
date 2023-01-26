package Seminar2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private ArrayList<Animal> animals;

    private Radio radio = new Radio("БлаРадио", 0);

    public Zoo() {
        animals = new ArrayList<Animal>();
    }

    public Zoo addAnimal (Animal a) {
        animals.add(a);
        return this;
    }
    public List<Speakable> getSpeakables () {
        List<Speakable> answer = new ArrayList<Speakable>();
        for (Animal an : animals) {
            answer.add(an);
        }
        answer.add(radio);
        return answer;
    }

    public List<Runable> getRunner () {
        List<Runable> result = new ArrayList<Runable>();
        for (Animal an : animals) {
            if (an instanceof Runable) {
                result.add((Runable)an);
            }
        }
        return result;

    }

    public int getChampionOfRunners () {
        int max = 0;
        String res = "";
        for (Runable runner : getRunner()) {
            if (max < runner.speedOfRun()) {
                max = runner.speedOfRun();
            }
        }

        return max;
    }

    public List<Flyable> getFlyers () {
        List<Flyable> result = new ArrayList<Flyable>();
        for (Animal an : animals) {
            if (an instanceof Flyable) {
                result.add((Flyable)an);
            }
        }
        return result;

    }   public List<Swimmable> getSwimmable() {
        List<Swimmable> result = new ArrayList<>();
        for (Animal an : animals) {
            if (an instanceof Swimmable) {
                result.add((Swimmable)an);
            }
        }
        return result;
    }
    public ArrayList<Animal> getAnimals() {
        return animals;
    }

}
