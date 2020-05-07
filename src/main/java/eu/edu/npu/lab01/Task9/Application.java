package eu.edu.npu.lab01.Task9;

public class Application {
    public static void main(String[] args) {
        String text = "I love and love and hate and hate% Good day%";
        text = text.toLowerCase();
        char stra[] = {'a','e','y','u','i','o'};
        char strb[] = {'q','w','r','t','p','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};

        String[] sentences;
        sentences = text.split("%");
        System.out.println(sentences.length);
//        System.out.println(sentences[0]);
//        System.out.println(sentences[1]);


        System.out.println(text);
        for (int k = 0; k < sentences.length; k++) {
            int suma=0;
            int sumb=0;
            for( int j=0; j<sentences[k].length(); j++) {
                for (int i = 0; i < stra.length; i++) {
                    if (sentences[k].charAt(j) == stra[i])
                        suma++;
                }

                for (int i = 0; i < strb.length; i++) {
                    if (sentences[k].charAt(j) == strb[i])
                        sumb++;
                }
            }
            System.out.printf("Loud"+" " +suma );
            System.out.printf("Constants"+" " +sumb);
            System.out.println();
        }


    }

}
