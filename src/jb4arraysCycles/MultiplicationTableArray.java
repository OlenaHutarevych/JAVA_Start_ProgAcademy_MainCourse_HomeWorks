package jb4arraysCycles;
/*
5.Сохранить таблицу умножения(из прошлого урока) в двумерный массив.
Запросить два числа у пользователя, прочитать из массива чему будет равно их произведение
и вернуть пользователю результат.
 */
import java.util.Scanner;

public class MultiplicationTableArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input first number : ");
        int number_first = in.nextInt();
        System.out.print("Input second number : ");
        int number_second = in.nextInt();

        if (number_first > 0 && number_first <=10 && number_second >0 && number_second <=10){
            int [][] array = new int[10][10];
            for (int i = 0; i<10; i++) {
                for (int j = 0; j <10; j++) {
                    array[i][j] = (i+1) * (j+1);
                }
            }
            System.out.println("result of multiplying numbers is " + array[number_first-1][number_second-1]);
        }
        else {
            System.out.println("Try again (the numbers must be >0 and <=10)");
        }
    }
}
