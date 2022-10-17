package beginning;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write YES");

        int displayInt = sc.nextInt();

//        for (int i = 0; i < 5; i++) {
//            System.out.println(displayString);
//
//        }
        while (displayInt!=5){
            System.out.println("Write fucking down the number 5!!");
            displayInt = sc.nextInt();
            if (displayInt!=5){
                System.out.println("Are you fucking kidding me ");
            }
        }

        System.out.println("Correct");




    }
}
