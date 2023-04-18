package jb4arraysCycles;

/*
1.1 В первом подъезде квартиры с 1 по 20. Во втором с 21 по 48. В третьем с 49 по 90.
Пользователь вводит номер квартиры. Программа должна указать в каком подъезде находится данная квартира.
 */
import java.util.Scanner;

public class AppartmentNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number of appartment: ");
        int number = in.nextInt();
        if (number >= 90  || number < 1)
            System.out.println("There is no such number of appartment in this building");
        else {
            if (number >= 1 && number <=20)
                System.out.println("The appartment is in the first entrance");
            else if (number >= 21 && number <=48)
                System.out.println("The appartment is in the second entrance ");
            else System.out.println("The appartment is in the third entrance ");
        }

    }
}
