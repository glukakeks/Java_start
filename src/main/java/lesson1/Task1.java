package lesson1;

import lesson1.classes.Point;
import lesson1.classes.Rectangle;
import lesson1.classes.Square;

import java.awt.geom.Area;

public class Task1 {

    public static void main(String[] args) {
        testtext("test");
        Square s = new Square(5);
        Point p1 = new Point(3, 7);
        Point p2 = new Point(1, 2);
        Rectangle r = new Rectangle(6, 8);

        System.out.println("Area of " + s.l + " = " + s.area());
        System.out.println("Area of " + r.a + " and " + r.b + " = " + r.area());
        System.out.println("distance of " + p1.x + "." + p1.y  +  " and " + p2.x + "." + p2.y +" = " + distance(p1,p2));
        System.out.println("distance of " + p1.x + "." + p1.y  +  " and " + p2.x + "." + p2.y +" = " + p1.distance(p2));
    }

    public static void testtext(String somet) {
        System.out.println("First " + somet);
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow((double) (p2.x - p1.x), 2.0D) + Math.pow((double) (p2.y - p1.y), 2.0D));


    }
}
