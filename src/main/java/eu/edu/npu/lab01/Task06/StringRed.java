package eu.edu.npu.lab01.Task06;

public class StringRed extends StringInp{
    public StringRed() {
    }

    public void Redact() {
        for(int i = 0; i < this.str.length(); ++i) {
            if (Character.isAlphabetic(this.str.charAt(i))) {
                System.out.print(this.str.charAt(i));
            } else if (this.str.charAt(i) == ' ') {
                System.out.print(this.str.charAt(i));
            } else {
                System.out.print(" ");
            }
        }

    }
}
