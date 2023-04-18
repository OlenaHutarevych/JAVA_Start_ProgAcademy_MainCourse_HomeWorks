package jb7exam;

import java.util.Scanner;
import java.util.Arrays;


public class ArrayStatistic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the size of array:");
        int sizeArray = input.nextInt();
        double [] arrayInput = new double [sizeArray];
        for (int i = 0; i < sizeArray; i++){
            System.out.println("Input the element of array:");
            arrayInput[i]= input.nextInt();
        }
        System.out.println(Arrays.toString(statistic(arrayInput)));
    }
    static double [] statistic(double [] array){
        double result [] = new double[3];
        double min = array[0];
        double max = array[0];
        double sa = 0;

        for (double j : array){
            if (j <= min){
                min = j;
            }
            if (j >= max){
                max = j;
            }
            sa = sa+j;
        }
        sa = sa / array.length;
        result[0] = min;
        result[1] = max;
        result[2]=sa;

        return result;
    }
}
