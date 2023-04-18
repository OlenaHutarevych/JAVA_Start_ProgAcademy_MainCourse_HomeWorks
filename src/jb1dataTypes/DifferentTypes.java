package jb1dataTypes;

public class DifferentTypes {
    public static void main(String[] args) {

        /*
        1.Задача: вывести на консоль литералы разных примитивных типов данных
         использовано 8 простых типов данных.
         */
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
    /*Задача:
    Создать перечисление Gender , которое будет иметь два значения - male and female .
    Вывести мужчину и женщину на консоль.*/
        enum gender{
            male,female
        }

        gender  woman  = gender.valueOf( "female");
        gender man = gender.valueOf("male");
        System.out.println("Mrs. Smith gender is " + woman);
        System.out.println("Mr. Smith gender is " + man);

        System.out.println("Mrs. Smith gender is " + gender.female);
        System.out.println("Mr. Smith gender is " + gender.male);
    }
}
/*
Задача:
Имея вымышленный целочисленный тип данных из 12 бит, просчитать какие значения он сможет хранить.
Решение:
всего слотов может быть 2 в 12 степени - это 4096 значений, т к тип целочисленный, то он сможет хранить диапазон от -2048 до +2047

Задача:
Имея вымышленный символьный тип данных из 4 бит, просчитать сколько разных символов он сможет обрабатывать.
Решение:
всего слотов может быть 2 в 4 степени - это 16 значений, т е наш тип сможет оперировать всего 16-ю символами.
 */
