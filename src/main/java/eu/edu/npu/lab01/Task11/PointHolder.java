package eu.edu.npu.lab01.Task11;

import java.util.Random;

public class PointHolder {
    private Point2D[] points;

    public PointHolder(int n) {
        Random rnd = new Random();
        points = new Point2D[n];
        for (int i = 0; i < n; ++i) {
            points[i] = new Point2D((Math.round(rnd.nextDouble()*100))/10, (Math.round(rnd.nextDouble()*100))/10);
        }
    }

    private double getLength(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }
    public void Showdots (){
        for (int i=0; i<points.length; i++){
            System.out.println(" x " + points[i].getX() + " y " + points[i].getY() );
        }
    }



    public Point2D getMinDistantPoint() {
        Point2D result = null;

        double minSum = Double.MAX_VALUE;
        for(int i=0; i<points.length; i++) {
            double sum = 0;
            for (Point2D p: points) {
                sum += getLength(points[i], p);
            }
            if (sum < minSum) {
                sum = minSum;
                result = points[i];
            }
        }
        return result;
    }

    public void Output(){
        System.out.println(getMinDistantPoint());
    }
}
