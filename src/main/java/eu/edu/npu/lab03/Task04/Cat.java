package eu.edu.npu.lab03.Task04;

public class Cat implements Talking, Walking {

    @Override
    public void talk() {
        System.out.println("I say mew");
    }

    @Override
    public void walk() {
        System.out.println("I like running");

    }
}
