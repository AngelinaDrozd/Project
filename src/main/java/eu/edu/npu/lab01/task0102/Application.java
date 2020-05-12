package eu.edu.npu.lab01.task0102;

public class Application {
    public static void main(String[] args) {
        int n;
        String[] Str;
        String[] Strr;
        StringArr StrArr = new StringArr();
        Sorting Sorts = new Sorting();
        n = StrArr.ArrQuanity();
        Str = StrArr.StrInput(n);
        Strr = Sorts.Sort(Str, n);
        StrArr.StrOutput(Strr, n);
    }
}
