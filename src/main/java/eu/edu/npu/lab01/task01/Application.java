package eu.edu.npu.lab01.task01;

public class Application {
    public static void main(String[] args) {
        String[] Strr;
        int n;
        StringArr Arr = new StringArr();
        FindShort Find = new FindShort();
        n = Arr.ArrQuanity();
        Strr = Arr.StrInput(n);
        Arr.StrOutput(Strr, n);
        Find.FindShortString(Strr, n);
    }
}
