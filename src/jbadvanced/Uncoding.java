package jbadvanced;

public class Uncoding {
    //метод, який декодує
    static char [] UncodingText (char array[]) {
        int j = 0;
        while (j < array.length) {
            if (array[j] != ' ') {
                j+=1;
            }
            else {
                array[j] = '%';
                array[j+1] ='2';
                array[j+2] = '0';
                j+=3;
            }
        }
        return (array);
    }
    public static void main(String[] args) {
        char [] input_Array1 = new char [] {'M','r', ' ', ' ', ' ', 'J', 'o', 'h', 'n', ' ', ' ', ' ', 'S', 'm', 'i', 't', 'h'};
        char [] input_Array2 = new char [] {'b','l', 'a', ' ', ' ', ' ', 'b', 'l', 'a', ' ', ' ', ' ', 'b', 'l', 'a'};

        System.out.println(UncodingText(input_Array1));
        System.out.println(UncodingText(input_Array2));
    }
}
