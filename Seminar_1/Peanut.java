package Seminar_1;

public class Peanut extends Product {
    private String type;
    private TypeSize size;

    public Peanut (String name, double cost, String type, TypeSize size) {
        super(name, cost);
        this.type = type;
        this.size = size;
    }

    @Override
    public String toString() {
            return String.format("%s, %s, size %s", super.toString(), type, size);
    }
}
