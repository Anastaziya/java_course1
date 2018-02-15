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

    /*Distance w = new Distance();
    w.p1.x = 2;
    w.p1.y = 2;
    w.p2.x = 3;
    w.p2.y = 3;
    // Point p1 = new Point (2, 2);
    // Point p2 = new Point (3, 3);
    System.out.println("Расстояние между точками = " + length1(w));
    */
  }

  public static void hello(String somebody) {
     System.out.println("Hello, " + somebody + "!");
  }

 /* public static double length1(Distance d) {
 //   return Math.sqrt(Math.pow((d.p1.x - d.p2.x), 2) + Math.pow((d.p1.y - d.p2.y), 2));
  }
  */
}