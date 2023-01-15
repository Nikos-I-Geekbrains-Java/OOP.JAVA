package Seminar_1;

public class Baton extends Product{
    private double calories;
    public Baton(String name, double cost, double calories) {
        super(name, cost);
        this.calories = calories;
    }

    @Override
    public String toString() {
        return String.format("%s calories: %f",super.toString(), this.calories);
    }

    public double getCalories() {
        return calories;
    }
}
