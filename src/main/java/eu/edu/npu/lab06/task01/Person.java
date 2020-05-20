package eu.edu.npu.lab06.task01;

public class Person implements GetName{
    private String authorName;

    public Person(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String name() {
        return this.authorName;
    };
}
