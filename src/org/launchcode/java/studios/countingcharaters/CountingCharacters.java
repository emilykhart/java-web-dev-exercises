package org.launchcode.java.studios.countingcharaters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args){
        System.out.println("Give me a string to count characters");
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine().toLowerCase();
                HashMap<Character, Integer> characters = new HashMap<>();
//                int totalChar = 0;
//
//                String  = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if" +
//                        " you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the " +
//                        "equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
                char [] charactersInString = inputString.toCharArray();
                for (char i : charactersInString) {
                    if (!characters.containsKey(i)){
                        characters.put(i, 1);
                    } else {
                        characters.put(i, characters.get(i) + 1); //put can be used to update (overriding)
                    }
                }
                for(Map.Entry<Character, Integer> i: characters.entrySet()){
                    System.out.println(i);
                }
            }
    }

