package edu.slovak;
/**
 * @author Vladyslav Zavada KNHUE
 *
 *      Classname Main
 *
 *      Module 1. Cycle practice.
 *          1. Write to console 8 facts about yourself using primitive types.
 *          2. Check a string as a palindrome.
 *          3. Get the area limited by the following functions x = 0 .. 3.14; y = sin(x); y = 0.1 * k, where k is the last cipher in your student card.
 *
 **/

public class Main {

    public static void main(String[] args) {
        // 1. Write to console 8 facts about yourself using primitive types.

        byte age = 24;
        String name = "Vlad";
        short height = 183;
        int salary = 8000;
        long longs = 6915000L;

        float weigth = 70f;
        double tree = 25;
        char symb = '$';
        boolean names = true;
        // Print result
        System.out.println("My name is " + name);
        System.out.println("I'm " + age + " years old");
        System.out.println("My height is " + height + "сm");
        System.out.println("My weigth is " + weigth + "kilo");
        System.out.println("Company pays " + salary + "$ month salary");
        System.out.println("The longest river in the world has a drainage basin " + longs + "km");
        System.out.println("Under favorable conditions, the pear reaches a large size " + tree + "m");
        System.out.println("USD = " + symb);
        if (names == true) {
            System.out.println("My name is Vlad");
        } else {
            System.out.println("My name is not Vlad");
        }

        // 2. Check a string as a palindrome.

        String text = "able was i ere i saw elba";
            String [] allWords = text
                    .toLowerCase()
                    .replaceAll("[\\s\\.\\?\\!,\\-\":;]+", " ")

                    .split("\\s+");

        String template = "";

        for (int i = 0; i < text.length(); i++) {
            int index = text.length() - i - 1;
            template += text.charAt(index);
        }
        // Print result
        System.out.println(template);

        if (text.equals(template)) {
            System.out.println("This sentence is palindrom - TRUE");
        } else {
            System.out.println("This sentence is not palindrom - FALSE");
        }

        // 3. Get the area limited by the following functions x = 0 .. 3.14; y = sin(x); y = 0.1 * k(25), where k is the last cipher in your student card.

        double PI = Math.PI;
        double y = 2.5;
        double dx = 0.1;
        double area = 0.0;

        for (double x = 0; x < PI; x += dx)
        {
            if (Math.sin(x) <= y) {
                area += Math.sin(x) * dx;
            } else {
                area += y * dx;
            }
        }
        // Print result
        System.out.println("The area = " + area);
    }
}