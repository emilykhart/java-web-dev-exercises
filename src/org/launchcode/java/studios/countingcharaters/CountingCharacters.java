package org.launchcode.java.studios.countingcharaters;

import java.util.HashMap;
public class CountingCharacters {
    public static void main(String[] args){
                HashMap<Character, Integer> characters = new HashMap<>();
                int totalChar = 0;

                String passage = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if" +
                        " you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the " +
                        "equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
                char [] charactersInString = passage.toCharArray();
                for (char i : charactersInString) {
                    if (!characters.containsKey(i)){
                        characters.put(i, 1);
                    } else {
                        characters.put(i, characters.get(i) + 1);
                    }
                }
                System.out.println(characters);
            }
    }

