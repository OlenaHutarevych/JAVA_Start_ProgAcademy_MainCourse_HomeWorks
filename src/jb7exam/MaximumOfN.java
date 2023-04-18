package jb7exam;

///////////////////////////            5               ////////////////////
/*
Написать метод, принимающий на вход строку из алфавитных латинских символов в lowercase и
 возвращающий на консоль символ, который встречается максимальное кол-во раз.
 Если таких символов несколько - вернуть все. Пример:
привет мир
р 2
и 2
 */

import java.util.HashMap;
import java.util.Scanner;

public class MaximumOfN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input the string: ");
        String inputString = input.nextLine().replaceAll(" ", "");
        maximumOfN(inputString);

    }
    static void maximumOfN(String inputStr) {
        char [] chars1 = inputStr.toLowerCase().toCharArray();

        HashMap<Character, Integer> firstMap = new HashMap<>();

        firstMap.put(chars1[0], 1);

        for (int i = 1; i < inputStr.length(); i++) {
            if (firstMap.containsKey(chars1[i])) {
                firstMap.put(chars1[i], firstMap.get(chars1[i]) + 1);
            } else firstMap.put(chars1[i], 1);
        }
        int number = 1;
        for (int value : firstMap.values()) {
            if (value >= number) {
                number = value;
            }
        }
        for (char key : firstMap.keySet()) {
            if (number == firstMap.get(key)){
                System.out.println("At most in the string there is a character "+ key + " :" + number + " times");
            }
        }
    }
}
