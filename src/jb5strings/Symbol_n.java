package jb5strings;
/*
1. Прочитать строку из пользовательского ввода и вернуть на консоль кол-во повторений символа ‘n’ в этой строке.
 */

import java.util.Scanner;

public class Symbol_n {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the string : ");
        String string = input.nextLine();

    // 1-й способ, переводит строку в массив символов и проверяет поэлементно на равность 'n'
        int counter1 = 0;
        char [] array_char = string.toCharArray();
        for (char i : array_char){
            if (i == 'n') {
                counter1++;
            }
        }
        System.out.println("the number of occurrences of the symbol 'n' in the input string is " + counter1);

        // 2-й способ  - проверяет каждый символ в строке на равность 'n'
        int counter2 = 0;
        for (int i = 0; i <string.length();i++){
            if(string.charAt(i) == 'n') {
               counter2 ++;
            }
        }
        System.out.println("the number of occurrences of the symbol 'n' in the input string is " + counter2);
    }
}
