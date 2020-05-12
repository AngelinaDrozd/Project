package ua.edu.npu.lab02.task02;

public class Application {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Rex");
        dog.setAge(4);
        dog.contacts();
        dog.said();
    }
}
