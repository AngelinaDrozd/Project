package eu.edu.npu.lab03.Task04;

public class Eagle implements Talking, Walking, Flying{
    @Override
    public void walk() {
        System.out.println("I'm walking");
    }

    @Override
    public void talk() {
        System.out.println("I'm hungry eagle");
    }

    @Override
    public void fly() {
        System.out.println("I fly very well");

    }
}
