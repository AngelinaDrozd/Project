package eu.edu.npu.lab06.task02;

public class Num implements GetName{

    public String getStr(int n) {
        return this.numbers[n];
    }
    private int randomNumber;
    private String[] numbers;

    public Num(int randomNumber) {
        this.randomNumber = randomNumber;
        this.numbers = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    }

    @Override
    public String getStr() {
        return String.valueOf(this.randomNumber);
    }


}
