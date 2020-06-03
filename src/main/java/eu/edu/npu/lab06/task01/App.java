package eu.edu.npu.lab06.task01;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Jane");
        System.out.println("Author: " + person.name());

        Week week = new Week(7);
        System.out.println("Day: " + week.name());
    }
}
