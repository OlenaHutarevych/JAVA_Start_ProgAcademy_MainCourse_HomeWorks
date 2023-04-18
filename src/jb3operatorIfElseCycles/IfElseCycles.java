package jb3operatorIfElseCycles;
import java.util.Scanner;
/*
Написать программу, которая имея три переменные типа инт с разными значениями выводит на консоль максимальное из них
(не использовать готовые методы, написать свою программу).
 */

public class IfElseCycles {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a first number: ");
        int a = in.nextInt();
        System.out.print("Input a second number: ");
        int b = in.nextInt();
        System.out.print("Input a third number: ");
        int c = in.nextInt();

        if (a == b || a == c || b == c)
            System.out.println("Wrong condition, the numbers must be different. Try again.");
        else {
            if ((a > b) && (a > c))
                System.out.println("max number is " + a);
            else if ((b > c) && (b > a))
                System.out.println("max number is " + b);
             else
                System.out.println("max number is " + c);
        }

    }
}
