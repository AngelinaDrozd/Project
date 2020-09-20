package eu.edu.npu.lab01.Task05;

public class Output extends StringInp {
    public void DoubleSpace () {
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + "  ");
        }
        System.out.println();
    }

    public void NumberStyle () {
        for (int i = 0; i < str.length(); i++ ) {
            if (Character.isUpperCase(str.charAt(i)) == true) {
                System.out.print((str.charAt(i) - 64) + " ");
            }
            else if(str.charAt(i) == ' ') {
                System.out.print("  ");
            }
            else if(Character.isLowerCase(str.charAt(i)) == true) {
                System.out.print((str.charAt(i) - 96) + " ");
            }
            else {
                System.out.print(" _ ");
            }
        }
    }
}
