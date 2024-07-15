package practice;

import java.awt.*;
import java.util.Arrays;

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
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 10;
        System.out.println(Arrays.toString(numbers)); // [1, 2, 10]

        int[] numbers2 = {0, 1, 2, 3, 4, 5};
        System.out.println(numbers2.length); // 6

        String[] names = new String[3];
        names[1] = "Julia";
        System.out.println(Arrays.toString(names)); // [null, Julia, null]
        Arrays.fill(names, "placeholder");
        System.out.println(Arrays.toString(names)); // [placeholder, placeholder, placeholder]

        String[] people = {
                "James",
                "John",
                "Cathy",
                "Ben"
        };
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
            /*
                James
                John
                Cathy
                Ben
            */
        }
        for (String person: people) {
            System.out.println(person);
            /*
                James
                John
                Cathy
                Ben
            */
        }
    }
}
