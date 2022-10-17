package lesson_4;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.stream; //Калькулятор который надо разобратся и доделать

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write number: " );
        String abc = "ABC";

        String inData = sc.nextLine();
//        for (char ch : inData.toCharArray()) {
//            String split = inData;
//        }
        Integer actionPosition = stream(inData.split(""))
                .filter("+-*/"::contains)
                .map(el -> inData.indexOf(el))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Not found ACTION POSITION"));

       String l1 = inData.substring(0,actionPosition);
       String l2 = inData.substring(actionPosition+1);
       String action = inData.substring(actionPosition,actionPosition+1);
       Integer.parseInt(l1);
       Integer.parseInt(l2);

//       switch (){
//           case:
//       }

        System.out.println(actionPosition);








    }
}
