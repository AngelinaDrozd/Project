package ua.edu.npu.lab02.task04;

public class Application {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 3);
        dog.said();
        dog.count();
        Dog dog1 = new Dog("Lol", 2);
        dog1.said();
        dog1.count();
        System.out.printf("Whole:" + String.valueOf(Dog.count));
    }
}
