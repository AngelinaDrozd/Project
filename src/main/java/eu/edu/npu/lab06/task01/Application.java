package eu.edu.npu.lab06.task01;

public class Application implements GetName{
    private String authorName;

    public Application(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String name() {
        return this.authorName;
    };
}
