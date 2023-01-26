// Теперь создать объект радио, и подумать, как его включить в объект Zoo.


package Seminar2;

public class Radio implements Speakable {

    private String name;
    private int box;

    public Radio(String name, int box) {
        this.name = name;
        this.box = box;
    }
    public String say() {
        return "Бла-бла-бла";
    }

    @Override
    public String toString() {return String.format("Радио: называется %s висит на центральной аллее", this.name);};

}
