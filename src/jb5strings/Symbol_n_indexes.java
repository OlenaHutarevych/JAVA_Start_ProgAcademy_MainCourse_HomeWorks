package jb5strings;
/*
2. Прочитать строку из пользовательского ввода и сохранить в массив все позиции символа ‘n’ в этой строке.
abcaabca, a → [0,3,4,7]
 */

import java.util.Arrays;
import java.util.Scanner;

public class Symbol_n_indexes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the string : ");
        String string = input.nextLine();
    // сначала считаем количество вхождения символа 'n'- это будет размер массива индексов вхождения
        int counter = 0;
        for (int i = 0; i <string.length();i++){
            if(string.charAt(i) == 'n') {
                counter ++;
            }
        }
    // создаем массив, который будем заполнять индексами вхождений
        int []  array_of_indexes = new int[counter];
        int index = 0;

    //проверяем каждый символ строки, равен ли он 'n', если да, то записываем его индекс в массив
        for (int i = 0; i <string.length();i++){
            if(string.charAt(i) == 'n') {
                array_of_indexes[index] = i;
                index ++;
            }
        }
    // переводим массив в строку для удобной формі вывода на консоль
        String array_string_of_indexes = Arrays.toString(array_of_indexes);
        System.out.println("Array, of indexes elements equals to 'n': " + array_string_of_indexes);
    }
}
