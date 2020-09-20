package eu.edu.npu.lab01.task04;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String s = " Hello Jane!";
        /*for ( int i=0; i<s.length(); i++){
            System.out.println(s.charAt(i));
        }*/

        String c = "";
        for ( int i=0; i<s.length(); i++){
            if (s.charAt(i) == 'o'){
                c += '3';

            }else
                c += s.charAt(i);
        }
        System.out.println(c);

    }
}
