package beginning;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        switch (age){
            case 7:
                System.out.println("You are a school boy");
                break;
            case 14:
                System.out.println("Big boy you have a passport");
                break;
            case 18:
                System.out.println("Damn big boy");
                break;
            default:
                System.out.println("There is no right age");

        }
    }
}
