package com.codingProblems;

import java.util.Stack;

/**
 * Given a string of words delimited by spaces reverse the words in the string
 *
 * EX: "cookies are delicious" -> "delicious are cookies"
 *
 */
public class ReverseWords {
    /*
        options:
        - could parse the string, pop each word on a stack. then pop each word off the stack and build a new string
            "cookies are delicious" -> ["delicious", "are", "cookies"] -> "delicious are cookies"
        - in place: swap each letter in the string. then reverse each word
            "cookies are delicious" -> "suoiciled era seikooc" -> "delicious are cookies"
     */
    void reverse(String str){
        System.out.println(str);

        Stack<String> stack = new Stack<>();
        String reversedStr = "";
        String[] split = str.split(" ");

        for (String word : split){
            System.out.println(word);
            stack.push(word);
        }

        while (!stack.isEmpty()) {
            reversedStr += stack.pop() + " ";
        }

        System.out.println(reversedStr.substring(0, reversedStr.length() - 1));
    }

    void reverseInPlace(String str) {

    }
}
