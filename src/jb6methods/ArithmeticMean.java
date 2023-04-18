package jb6methods;

/*
2. Написать метод, который принимает на вход числовой массив и возвращает среднее арифметическое по нему.
 */

import java.util.Scanner;

public class ArithmeticMean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the size of array:");
        int sizeArray = input.nextInt();
        double [] arrayInput = new double [sizeArray];
        for (int i = 0; i < sizeArray; i++){
            System.out.println("Input the element of array:");
            arrayInput[i]= input.nextInt();
        }
        System.out.println("The arithmetic mean of input array is: " + arithmeticMean(arrayInput));
   }

   static double arithmeticMean (double [] array ){
        double sum = 0;
       for (double j : array) {
           sum = sum + j;
       }
       return sum / array.length;
   }
}
