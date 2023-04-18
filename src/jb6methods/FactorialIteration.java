package jb6methods;
/*
0. Написать итеративный метод, который возвращает факториал заданного числа.

0.5. Написать рекурсивный метод, который возвращает факториал заданного числа.
 */

import java.util.Scanner;

public class FactorialIteration {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input number: ");
        int number;
        number = input.nextInt();
        System.out.println(number + "! = " + factorial(number));
        System.out.println(number + "! = " + factorialRecursion(number));

    }
    static long factorial (int n){
        long result  = 1;
        for (int i = 1; i <= n; i++){
             result = result * i;
        }
        return result;
    }

    static long factorialRecursion (int n){
        long result;
        if (n == 0) {
            result = 1;
            return result;
        }
        result = n * factorialRecursion(n -1);
        return (result);
    }
}
