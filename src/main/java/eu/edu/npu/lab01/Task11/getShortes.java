package eu.edu.npu.lab01.Task11;

public class getShortes extends Input {
    public double getLength(int x1, int x2, int y1, int y2){
        double lengthPow = 0;
        double side;
        lengthPow = ((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2));
        side = Math.sqrt(lengthPow);
        return side;
    }
}
