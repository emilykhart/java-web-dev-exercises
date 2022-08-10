package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayListPractice {
    private static Scanner input;

    public static void main(String[] args) {
        ArrayList<Integer> numsList = new ArrayList<>();
        ArrayList<String> wordsList = new ArrayList<>();
        numsList.add(250);
        numsList.add(658);
        numsList.add(74);
        numsList.add(19);
        numsList.add(47);
        numsList.add(48);
        numsList.add(726);
        numsList.add(1);
        numsList.add(42);
        numsList.add(987);

        wordsList.add("Brad");
        wordsList.add("Emily");
        wordsList.add("Lizzy");
        wordsList.add("Kris");
        wordsList.add("Slash");
        wordsList.add("Emma");
        wordsList.add("Coffee");
        wordsList.add("Java");
        wordsList.add("Coding");
        wordsList.add("Spear");

        System.out.println(evenSum(numsList));
        System.out.println("Enter a word length: ");

        fiveWords(wordsList);
    }

    public static int evenSum(ArrayList<Integer> numsList) {
        int total = 0;
        for (int integer : numsList) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static void fiveWords(ArrayList<String> wordsList) {
        for (String string : wordsList) {
            if (string.length() == 5) {
                System.out.println(string);
            }
        }
    }
}


