package eu.edu.npu.lab01.Task06;
import java.util.Scanner;

public class StringInp {
    Scanner input;
    String str;

    public StringInp() {
        this.input = new Scanner(System.in);
        this.str = new String();
    }

    public void StringInput() {
        this.str = this.input.nextLine();
    }
}
