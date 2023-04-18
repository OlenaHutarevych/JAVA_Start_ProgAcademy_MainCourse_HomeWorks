package jb7exam;

import java.util.Scanner;

public class LowerUpperCase {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Input the char: ");
        String inputString = input.nextLine();
        int a ='a';
        int z = 'z';
        char inputChar = inputString.charAt(0);

        if  ((int) inputChar >= a && (int) inputChar <= z){
            System.out.println("small");
        }
        else System.out.println("big");
    }
}
//char inputChar1 = inputString.toLowerCase().charAt(0);
//if (inputChar == inputChar1){
//  System.out.println("small");
//}
//else {
//   System.out.println("big");
//}