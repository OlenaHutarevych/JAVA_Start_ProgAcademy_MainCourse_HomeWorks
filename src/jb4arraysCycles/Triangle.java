package jb4arraysCycles;
/*
2. Создать программу, которая имея переменную n типа int с произвольным значением,
 рисует треугольник из n строк ***
 */
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number : ");
        int n = in.nextInt();
        if (n <= 0){
            System.out.println("wrong number, try again");
        }
        else {
            for (int i = 1; i <= n; i++){
                String print = "";
                for (int j = 1; j <= i; j++){
                    print += "*";
                }
                System.out.println(print);
            }
        }
    }
}
