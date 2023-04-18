package jb4arraysCycles;
/*
6.Создать два числовых массива на 5 элементов каждый со случайными значениями.
Создать третий массив такой же длины, пустой.
Сохранить в него максимальные значения из каждой пары(сравнивать пары из первого и второго массива). Например,
{3,5,1,2,3} и {2,1,3,5,2} => {3,5,3,5,3}

Я взяла диапазон до 1000 и добавила печать элементов массива, чтоб было видно, что программа работает корректно.
 */


public class MaxElementFive {
    public static void main(String[] args) {
        int [] array = new int[5];
        int [] array1 = new int[5];
        int [] array2 = new int[5];

        for (int i = 0; i < 5; i++){
            array1[i] = (int) ( Math.random()*1000);
            array2[i] = (int) ( Math.random()*1000);
            System.out.println((i+1)+ " element of first array: "+array1[i] + " "+(i+1) + " element of second array: " + array2[i]);
            if (array1[i] > array2[i]){
                array[i] = array1[i];
            }
            else
                array[i] = array2[i];
        }
        System.out.print("Array of maximums: ");
        for (int i : array){
            System.out.print(i + " ");
        }
    }
}
