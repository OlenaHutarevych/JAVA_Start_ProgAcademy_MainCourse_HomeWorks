package jbadvanced;

public class FindLostNumber {
    static int LostNumber(int[] array) {  // отримуємо масив на int вхід методу

        // ініціалізуємо змінні для підрахунку сумм
        int sum = 0;
        int sum1 = 0;

        //знаходимо сумму значень нашого масиву з пропущеним числом
        for (int j : array) {
            sum += j;
        }
        //знаходимо сумму значень повної послідовності
        for (int i=1; i <= array.length+1; i+=1){
            sum1 +=i;
        }

        // знаходимо різницю сумм - це і буде пропущене число
        return(sum1 - sum);
    }

    public static void main(String[] args) {
        int [] inputArray = new int[]{1, 9, 5, 6, 8, 2, 3, 7, 10, 15, 14, 16, 11, 13, 4};
        System.out.println(LostNumber(inputArray));
    }
}

