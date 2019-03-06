package edu.dmacc.codedsm.hw9;

import java.util.ArrayList;
import java.util.Random;

public class randomIntegerListGenerator {

    public static void main(String[] args) {
        ArrayList<Integer> integers = generateIntegers(20);
        for (int i : integers) {
            System.out.println("i = " + i);
            if (i % 15 == 0) { //a number divisible by 3 and 5 is also divisible by 15;
                System.out.println("Fizzbuzz");
                System.out.println();
                i++;
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
                System.out.println();
                i++;
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
                System.out.println();
                i++;
            } else {
                System.out.println("Number " + i + " is not fizzy.");
                System.out.println();
            }
        }
    }


    public static ArrayList<Integer> generateIntegers(int size) {
        ArrayList<Integer> xs = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            xs.add(Math.abs(random.nextInt(Integer.MAX_VALUE - 1) + 1));
        }
        return xs;
    }
}