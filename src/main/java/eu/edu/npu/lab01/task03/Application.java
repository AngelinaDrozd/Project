package eu.edu.npu.lab01.task03;

public class Application {
    public static void main(String[] args) {
        StringArr StrArr = new StringArr();
        Scissors StrLimit = new Scissors();
        String[] Str;
        int n;
        float avg;
        n = StrArr.ArrQuanity();
        Str = StrArr.StrInput(n);
        avg = StrLimit.AvgLength(Str, n);
        StrLimit.StrOutput(Str, n, avg);
    }
}
