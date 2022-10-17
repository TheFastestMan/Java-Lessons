package beginning;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inValue;
        do{
            System.out.println("Write number 5 ");
            inValue = scan.nextInt();
        } while (inValue!=5);

        System.out.println("Correct");

    }
}
