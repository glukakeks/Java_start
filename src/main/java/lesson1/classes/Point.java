package lesson1.classes;

public class Point {
    public int x;
    public int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public  double distance(Point p2) {
        return Math.sqrt(Math.pow((double) (p2.x - this.x), 2.0D) + Math.pow((double) (p2.y - this.y), 2.0D));


    }
}
