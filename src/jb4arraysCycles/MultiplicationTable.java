package jb4arraysCycles;
/*
0. Распечатать на консоль таблицу умножения(
1 * 1 = 1
1 * 2 = 2
итд
2 * 4 = 8
) и так для каждой пары чисел. Подсказка: нужно использовать цикл вложенный в цикл
 */

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i<=10; i++){
            for (int j =1; j<=10; j++){
                int multi = i*j;
                System.out.println(i + " * "+ j + " = " + multi);
            }
        }
    }
}
