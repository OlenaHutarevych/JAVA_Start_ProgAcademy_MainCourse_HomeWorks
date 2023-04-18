package jb4arraysCycles;
/*
1. Написать программу, итерирующуюся по всем числам, кратным 5 от 5 до 150, и собрать их сумму.
 Создать вариации с использованием разных циклов(while, for, do while).
 */

public class SumMultiplesOf5 {
    public static void main(String[] args) {

        // Цикл for
        int sum = 0;
        for (int i = 5; i <=150; i+=5){
            sum +=i;
        }
        System.out.println(sum);

        //Цикл while

        sum = 0;
        int i =5;
        while (i <=150){
            sum +=i;
            i+=5;
        }
        System.out.println(sum);

        //Цикл do while

        sum = 0;
        i = 5;
        do {
            sum +=i;
            i+=5;
        } while (i <=150);
        System.out.println(sum);
    }
}
