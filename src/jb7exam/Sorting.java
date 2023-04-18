package jb7exam;
////////////////////////////////3 задача  ///////////////////////////////////////

/*Написать метод, который принимает на вход два отсортированных целочисленных массива,
и возвращает новый массив, в котором будут хранится все элементы из первого и второго массива
также в отсортированном виде.

Пример:
Вход: [2,5,7,9, 10] [1,3,4,6,8]
Выход: [1,2,3,4,5,6,7,8,9, 10] */


import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input the size of first array:");
        int sizeArray = input.nextInt();

        int [] arrayInput1 = new int  [sizeArray];
        for (int i = 0; i < sizeArray; i++){
            System.out.println("Input the element of array:");
            arrayInput1[i]= input.nextInt();
        }

        System.out.println("Input the size of second array:");
        int sizeArray1 = input.nextInt();
        int [] arrayInput2= new int  [sizeArray1];
        for (int i = 0; i < sizeArray1; i++){
            System.out.println("Input the element of array:");
            arrayInput2[i]= input.nextInt();
        }
        System.out.println(Arrays.toString(arrayInput1));
        System.out.println(Arrays.toString(arrayInput2));
        System.out.println(Arrays.toString(sorting(arrayInput1,arrayInput2)));

    }
    static int [] sorting(int [] arr1, int [] arr2){
        int [] sorted = new int[arr1.length + arr2.length];

            int i1 = 0;
            int i2 = 0;
            for (int i = 0; i < sorted.length; i++){
                if (i1 <= (arr1.length-1)){
                    if (((arr1[i1] < arr2[i2]))){
                        sorted[i] = arr1[i1];
                        i1++;                    }
                    else{
                        sorted[i] = arr2[i2];
                        i2++;
                    }
                }
                else if (i2 <= (arr2.length-1)){
                    sorted[i] = arr2[i2];
                    i2++;
                }
            }
        return sorted;
    }
}
