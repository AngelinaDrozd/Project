package eu.edu.npu.lab06.task01;

public class Week implements GetName{
    private int dayOfWeek;
    private String[] days;

    public Week(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        this.days = new String[]{ "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    }

    @Override
    public String name() {
        return String.valueOf(this.days[this.dayOfWeek-1]);
    }
}
