package eu.edu.npu.lab06.task03;

public class Name implements GetName{
    public String getStr(String str) {
        char[] arr = str.toCharArray();
        StringBuilder noDigits = new StringBuilder();
        for (char c : arr) {
            if (!Character.isDigit(c)) {
                noDigits.append(c);
            }
        }
        return noDigits.toString();
    }
}
