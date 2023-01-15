package Seminar_1;

public class SuperBaton extends Baton{
    
        private TypeSize size;
        public SuperBaton(String name, double cost, double calories, TypeSize size) {
            super(name,cost,calories);
            this.size = size;
        }
    
        @Override
        public String toString() {
                return String.format("%s size %s", super.toString(), size);
        }
}
