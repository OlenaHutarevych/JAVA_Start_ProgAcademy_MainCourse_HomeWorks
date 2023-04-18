package jb4arraysCycles;
/*
4. Создать массив типа инт на 5 элементов. Используя сканнер, прочитать 5 интов из пользовательского
ввода и сохранить их в массив. Найти максимальное число из всего массива и вывести его на экран.
 */
import java.util.Scanner;

public class ArrayFiveElements {
    public static void main(String[] args) {
        int [] array = new int[5];

        for (int i = 0; i < 5; i++){
            Scanner in = new Scanner(System.in);
            System.out.print("Input number : ");
            array [i]= in.nextInt();
        }
        int max =array[0];
        for (int i = 1; i < 5; i ++){
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("array's maksimum is " + max);
    }
}
