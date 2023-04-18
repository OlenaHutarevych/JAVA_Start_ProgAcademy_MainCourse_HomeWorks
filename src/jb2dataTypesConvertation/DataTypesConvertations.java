package jb2dataTypesConvertation;

public class DataTypesConvertations {

        public static void main(String[] args) {

 // 1   1. Создать 8 переменных разных примитивных типов данных. Сохранить в них разные допустимые значения
            // (литерал float должен заканчиваться на f, а long на l). Распечатать значения переменных на консоль.
            byte b = 13;
            short sh = 1027;
            int i = 32268;
            long l = 2321456978415255L;
            float f = 25.327f;
            double d = 1258758.5;
            boolean bool = true;
            char ch = 'n';

            System.out.println(b);
            System.out.println(sh);
            System.out.println(i);
            System.out.println(l);
            System.out.println(f);
            System.out.println(d);
            System.out.println(bool);
            System.out.println(ch);
 //2.1  2. Создать 3 численных переменных(можно разных типов),
            // 2.1 вывести их сумму на консоль.
            // 2.2 вывести их произведение на консоль.
            // 2.3 вывести true, если 1 переменная больше, чем 2, иначе false.
            // 2.4 вывести true, если 1 переменная больше, чем сумма 2 и 3, иначе false.
            System.out.println(b+sh+i);
 //2.2
            System.out.println(b*sh*i);
 //2.3
            System.out.println(b>sh);
 //2.4
            System.out.println(b>(sh*i));
//5.1   5.1 Узнать какой код стоит за символом 'ё'(подсказка: привести тип char к типу int).
            int uni_ch = 'ё';
            System.out.println("Number of 'ё' in Unicode is " + uni_ch);


        }
}
