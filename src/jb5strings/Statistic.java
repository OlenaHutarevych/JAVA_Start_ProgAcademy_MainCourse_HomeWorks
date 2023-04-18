package jb5strings;

/*
4. Прочитать строку из пользовательского ввода и вернуть пользователю статистику о том,
сколько раз встречался каждый из символов
(пользователь может вводить только алфавитные латинские символы, lowercase)
 */
import java.util.Scanner;

public class Statistic {
    // метод валидации, проверяет валидность введенных данных от пользоателя
    public static boolean statistic_valid(String s, int begin_alphabet, int end_alphabet){
        boolean c = true;
        for (int symbol = 0; symbol < s.length(); symbol++) {
            int symbol_int = s.charAt(symbol);

            if (symbol_int >= begin_alphabet && symbol_int <= end_alphabet) {
                continue;
            }
            else {
                System.out.println("The input string contains prohibited symbol, try again (all symbols must be in english lowercase)");
                c = false;
                break;
            }
        }
        return (c);
    }
   // основной метод, получает строку на вход, считает количество вхождений символов, если строка валидна
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the string(all symbols must be in english lowercase):");
        String string = input.nextLine();

        int a_int = 'a';
        int z_int ='z';

        if (statistic_valid(string,a_int,z_int)) {
            for (int i = a_int; i <= z_int; i++){
                int counter = 0;
                for (int j = 0; j < string.length(); j++){
                    if (string.charAt(j) == (char)(i)){
                        counter++;
                    }
                }
                if (counter != 0){
                    System.out.println("The symbol "+ (char)(i) + " occurs " + counter+ " times" );
                }
            }
        }
    }
}
