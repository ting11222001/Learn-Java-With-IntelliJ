package practice;

import java.awt.*;

public class Foo {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int amount = 1_000_000;
        System.out.println(amount); // 1000000

        int numberOne = 0;
        System.out.println(numberOne++); // 0
        System.out.println(numberOne); // 1
        int numberTwo = 0;
        System.out.println(++numberTwo); // 1
        System.out.println(numberTwo); // 1

        String brand = "practice";
        System.out.println(brand.substring(0, 5)); // pract

        System.out.println(brand.toUpperCase()); // PRACTICE
        System.out.println(brand.toLowerCase()); // practice

        System.out.println(" ".isEmpty()); // false
        System.out.println(" ".isBlank()); // true

        System.out.println(" xxx ".isBlank()); // false
        System.out.println(" xxx ".trim()); // xxx

        // Reference Objects
        Point pointA = new Point(0, 0);
        System.out.println("pointA = " + pointA); // pointA = java.awt.Point[x=0,y=0]
        System.out.println("pointA.x = " + pointA.x); // pointA.x = 0

        // Arrays
        
    }
}
