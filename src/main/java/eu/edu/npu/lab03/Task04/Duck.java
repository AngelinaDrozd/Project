package eu.edu.npu.lab03.Task04;

public class Duck implements Talking, Swimming, Walking, Flying {
    @Override
    public void fly() {
        System.out.println("I fly very bad");
    }

    @Override
    public void swim() {
        System.out.println("I swim all time");
    }

    @Override
    public void talk() {
        System.out.println("Krya");
    }

    @Override
    public void walk() {
        System.out.println("I walk vey fast");
    }
}
