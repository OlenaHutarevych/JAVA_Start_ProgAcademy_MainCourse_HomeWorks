package jb4arraysCycles;
/*
3. Создать массив и сохранить в него все кириллические алфавитные символы.
Обойти массив в цикле и прочитать каждый из них.
 */

public class CyrillicSymbols {
    public static void main(String[] args) {
        char a = 'А';
        int uni_a = a;
        char z = 'я';
        int uni_z = z;
        char [] cyrillic = new char[(uni_z-uni_a+1)];
        for (int i = 0; i <=(uni_z -uni_a); i++){
            cyrillic[i] = (char)(uni_a +i);
            System.out.print(cyrillic[i]+" ");
        }

    }
}
