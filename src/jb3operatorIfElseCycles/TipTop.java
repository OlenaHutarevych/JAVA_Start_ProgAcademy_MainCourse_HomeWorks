package jb3operatorIfElseCycles;
/*
3. Написать программу, которая повторяется 100 раз, и печатает на консоль строку “Tip” в одном повторе,
а в следующем “Top”(в итоге комбинация “Tip” “Top” повторится 50 раз). * Печатать “Tip” и “Top” в разных повторах цикла.
 */

public class TipTop {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i+=1){
            if (i % 2 != 0) {
                System.out.print("Tip");
            }
            else
                System.out.println("Top");

        }
    }
}
