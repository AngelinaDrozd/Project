package eu.edu.npu.lab01.Task07;

public class StringSplit extends StringInp {
    String[] StringArr;
    public void Split () {
        StringArr = str.split(" ");
    }

    public void out () {
        for (String a : StringArr)
            System.out.print(a + " ");
    }
}
