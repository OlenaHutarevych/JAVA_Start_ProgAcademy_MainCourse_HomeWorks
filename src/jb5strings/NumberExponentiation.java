package jb5strings;
/*
3. Написать программу, которая читает два числа из пользовательского ввода
и возводит первое число в степень второго числа.
 */

import java.util.Scanner;

public class NumberExponentiation {
    public static void main(String[] args) {

    //считываем два числа от пользователя

        Scanner input = new Scanner(System.in);
        System.out.print("Input first number(the basis) : ");
        int number_basis = input.nextInt();
        System.out.print("Input first number(the degree) : ");
        int number_degree = input.nextInt();

     // 1 способ

    // определяем переменную, в которую положим результат вычислений
        double result = number_basis;

    // цикл считает возведение в степень двух положительных чисел
        for (int i =1; i < Math.abs(number_degree); i++){
            result = result * number_basis;
        }
    // рассматриваем частные случаи, если степень отрицательная
        if (number_degree < 0){
            result = 1/ result;
        }
    // если степень равна 0
        else if (number_degree == 0){
            result = 1;
        }

        System.out.println(result);

    // 2 способ
    // метод, позволяющий сделать все в одрну строку
        System.out.println(Math.pow(number_basis, number_degree));
    }
}
