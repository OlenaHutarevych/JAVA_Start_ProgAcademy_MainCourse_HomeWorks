package jb7exam;
 ///////////////////////////////////////     4       /////////////////////////////////
/*
Написать метод, принимающий на вход две строки, содержащие только символы латинского алфавита,
 который проверит, является ли строка 1 анаграммной строке 2.
 Строка является анаграммной другой строке в том случае,
 если из первой можно сконструировать вторую просто поменяв местами символы.
 Символы в разных регистрах необходимо интерпретировать как эквивалентные. Примеры:
abc bca -> true
abcd DaBc -> true
abc cbd -> false
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class Anagramm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input the first string: ");
        String firstString = input.nextLine().replaceAll(" ", "");
        System.out.println("Input the second string: ");
        String secondString = input.nextLine().replaceAll(" ", "");

/// вызов первого способа anagramm2 - с использованием мапы
        if (firstString.length() != secondString.length())
            System.out.println("The strings are not anagram");

        else if (anagram2(firstString, secondString)){
            System.out.println("The strings are anagrams");
        }
        else {
            System.out.println("The strings are not anagrams");
        }
/// вызов второго способа  anagram2- - с использованием сортировки массива символов

        if (anagram(firstString, secondString)){
            System.out.println("The strings are anagrams");
        }
        else {
            System.out.println("The strings are not anagrams");
        }
    }

    /// метод, использующий сортировку и последующее сравнение массивов символов, полученных из входящих строк
    static boolean anagram(String st1, String st2){
        char[] chars1 = st1.toLowerCase().toCharArray();
        Arrays.sort(chars1);
        st1 = new String(chars1);
        char[] chars2 = st2.toLowerCase().toCharArray();
        Arrays.sort(chars2);
        st2 = new String(chars2);
        boolean bool;
        bool = st1.equals(st2);

        return bool;
    }

    /// метод, использующий карты, пары ключ - значение
    static  boolean anagram2(String st1, String st2){

        String [] chars1 = st1.toLowerCase().split("");
        String [] chars2 = st2.toLowerCase().split("");
        boolean bool1 = true;

        HashMap<String, Integer > firstMap = new HashMap<>();

        firstMap .put(chars1[0], 1);

        for (int i = 1; i< st1.length(); i++){
            if (firstMap .containsKey(chars1[i])){
                firstMap .put(chars1[i], firstMap .get(chars1[i])+1);
            }
            else firstMap .put(chars1[i], 1);
        }
        for (int i = 1; i< st2.length(); i++){
            if (firstMap .containsKey(chars2[i])){
                firstMap .put(chars2[i], firstMap .get(chars2[i])-1);
            }
            else return false;

        }

        for(String entry: firstMap.keySet()){
            bool1 = firstMap.get(entry) == 0;
        }
        return bool1;
    }
}
