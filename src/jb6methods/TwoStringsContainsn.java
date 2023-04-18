package jb6methods;

/*
1. Написать метод, которій принимает на вход две строки и символ n
и возвращает ответ на вопрос, содержат ли обе строки одинаковое кол-во вхождений символа n.
 */

import java.util.Scanner;

public class TwoStringsContainsn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first string: ");
        String firstStr = input.nextLine();
        System.out.println("Input the second string: ");
        String secondStr = input.nextLine();
        System.out.println("Input the symbol: ");
        String  symbol = input.next();
        char symbolChar = symbol.charAt(0);

        if (equalContainsOfN(firstStr,secondStr,symbolChar)){
            System.out.println("Yes, both strings contains equal number of occurrences of symbol '" + symbolChar + "'");
        }
        else System.out.println("No, both strings contains different number of occurrences of symbol '" + symbolChar + "'");
    }

    static boolean equalContainsOfN(String firstString, String secondString, char n){
        int counter1 = 0;
        for (int i = 0; i <firstString.length();i++){
            if(firstString.charAt(i) == n) {
                counter1 ++;
            }
        }
        int counter2 = 0;
        for (int i = 0; i <secondString.length();i++){
            if(secondString.charAt(i) == n) {
                counter2 ++;
            }
        }
        return counter1 == counter2;

    }
}
