package jb7exam;

////////////////////////      6       //////////////
/*
 Написать метод, который принимает на вход искомый int и двумерный массив типа int,
 где данные отсортированы в каждой строке и колонке.
  Метод должен отвечать на вопрос содержится ли искомый int в матрице.
 */

import java.util.Scanner;
import java.util.Arrays;

public class FindNumberInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input the number: ");
        int inputInt = input.nextInt();

        System.out.println("Input the number of array's strings: ");
        int strings = input.nextInt();

        System.out.println("Input the number of array's columns  : ");
        int columns = input.nextInt();

        int[][] inputArray = new int[strings][columns];

        for (int i = 0; i < strings; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println((i + 1) + "string: input " + (j + 1) + " element: ");
                inputArray[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < strings; i++) {
            System.out.println(Arrays.toString(inputArray[i]));
        }

        if (isIntInArray(inputInt, strings, columns, inputArray) == true)
            System.out.println("Yes,the int " + inputInt + " is in the array");
        else
            System.out.println("No,the int " + inputInt + " is not in the array");
    }
    static boolean isIntInArray(int inputInt, int strings, int columns,int [][] inputArray) {

        boolean bool = false;

        for (int i = 0; i < strings; i++) {
            for (int j = 0; j < columns; j++) {
                if (inputArray[i][j] == inputInt)
                    bool = true;
                else if (inputArray[i][j] > inputInt) {
                    columns = j;
                    break;
                }
            }
        }
        System.out.println(bool);
        return bool;
    }
}


