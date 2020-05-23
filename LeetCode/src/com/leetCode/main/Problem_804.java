package com.leetCode.main;
import java.sql.Array;
import java.util.*;
public class Problem_804 {

    public static void main(String[] args) {

        System.out.println(uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));

    }
    public static  int uniqueMorseRepresentations(String[] words) {

            String[] data = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

            Set<String> output = new HashSet<>();

            for(int i = 0 ; i < words.length ; i++){
                StringBuilder stringBuilder = new StringBuilder();
                for(int j = 0 ; j < words[i].length(); j++){
                    stringBuilder.append(data[(int)words[i].charAt(j) - 96-1]);
                }
                output.add(stringBuilder.toString());

            }
            return output.size();
    }

}
