package eu.edu.npu.lab03.task01;

public class Application {
    public static void main(String[] args) {
        Animals animals1 = new Animals("Fish");
        Animals animals2 = new Animals("Butterfly");
        Animals animals3 = new Animals("Dog");
        Animals animals4 = new Animals("Bird");

        animals1.swimming();
        animals2.flying();
        animals3.walking();
        animals4.talking();
    }
}
