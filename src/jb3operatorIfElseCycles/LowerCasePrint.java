package jb3operatorIfElseCycles;
/*
4. Создать программу, которая печатает все маленькие символы латинского алфавита(использовать любой цикл).
 */

public class LowerCasePrint {
    public static void main(String[] args) {
        int uni_a = 'a';
        char z = 'z';
        int uni_z = z;

        for (int i = uni_a; i <= uni_z; i+=1){
            char x = (char) i;
            System.out.print(x + " ");
        }
    }
}
