package jb3operatorIfElseCycles;
/*
2. Написать программу, которая используя цикл for собирает сумму чисел от 1 до 200, и печатает результат на консоль
 */

public class Sum200 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <=200; i+=1){
            sum += i;
        }
        System.out.println("The sum from 1 to 200 is " +sum);
    }
}
