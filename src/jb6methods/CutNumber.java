package jb6methods;
/*
3. Написать метод, который принимает на вход строку с числом(и не только),
и возвращает пользователю число, хранящееся в строке.
 Например:
 "boo123 adf " -> 123
 " 12 .1231" -> 12
 "only text" -> 0
 */

import java.util.Scanner;

public class CutNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input the string: ");
        String inputString = input.nextLine();

        System.out.println(cutNumber(inputString));
    }
    static int cutNumber(String inputStr){
            char[] inputStringToChararray = inputStr.toCharArray();

            StringBuilder numberInString = new StringBuilder();
            int firstNumber = '0';
            int lastNumber = '9';

            for (int i = 0; i < inputStringToChararray.length; i++) {
                if ((int) inputStringToChararray[i] >= firstNumber && (int) inputStringToChararray[i] <= lastNumber) {
                    numberInString.append(inputStringToChararray[i]);
                    if (i < inputStringToChararray.length - 1) {
                        if ((int) inputStringToChararray[i + 1] < firstNumber || (int) inputStringToChararray[i + 1] > lastNumber) {
                            break;
                        }
                    }
                }
            }
            String result = (String.valueOf(numberInString));
            int resultInt;
            if (result.isEmpty())
                resultInt = 0;
            else
                resultInt = Integer.parseInt(result);

            return resultInt;
    }
}
