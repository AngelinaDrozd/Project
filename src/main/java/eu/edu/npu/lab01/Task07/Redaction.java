package eu.edu.npu.lab01.Task07;

public class Redaction extends StringSplit{
    public void Redact () {
        int length;
        char letter;
        System.out.println("Enter length of word: ");
        length = input.nextInt();
        System.out.println("Enter first letter of word: ");
        letter = input.next().charAt(0);
        Split();
        for(int i=0; i<StringArr.length; i++) {
            if(StringArr[i].charAt(0) == letter && StringArr[i].length() == length){
                StringArr[i] = "";
            }
        }
    }
}
