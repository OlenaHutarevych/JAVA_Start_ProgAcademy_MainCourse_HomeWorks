package jb3operatorIfElseCycles;
/*
5.Создать программу, которая выведет ряд чисел, кратных 5, начиная от 100 до 0. Пропустить значение 45.
 */

public class FivePrint {
    public static void main(String[] args) {
        for (int i = 100; i >=0; i-=5){
            if (i == 45)
                continue;
            System.out.print(i + " ");
        }
    }
}
