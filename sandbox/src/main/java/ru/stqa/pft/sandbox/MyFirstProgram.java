package ru.stqa.pft.sandbox;

import java.awt.*;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Nastya");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    /*Point p1 = new Point (0, 0);
    Point p2 = new Point (3, 3);
    System.out.println("Расстояние между точками = " + length1(p1, p2));


    Point p1 = new Point(1 , 1);
    Point p2 = new Point(3 , 3);
    Distance d1 = new Distance(p1, p2);
    Distance d = new Distance((1, 1), (2, 2));
    System.out.println("Расстояние между точками = " + length1(d)); */

  }

  public static void hello(String somebody) {
     System.out.println("Hello, " + somebody + "!");
  }

  /* public static double length1(Point p1, Point p2) {
     return Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
  }
  */

  public static double length1(Distance d) {
    return Math.sqrt(Math.pow((d.p1.x - d.p2.x), 2) + Math.pow((d.p1.y - d.p2.y), 2));
  }

}