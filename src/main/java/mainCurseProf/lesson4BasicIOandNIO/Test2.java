package mainCurseProf.lesson4BasicIOandNIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws IOException {
//        try {
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            String str = br.readLine();
//            System.out.println(str);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        float f = sc.nextFloat();
//        String string0 = sc.next();
//        String string1 = sc.nextLine();
//        String string2 = sc.nextLine();
//        System.out.println("Number "+i+" Float "+f+" First word "+string0+" Second word "+string1+" Third word "+string2);
//
//        int a = System.in.read();
//        System.out.println(a);
//        System.out.println((char)a);

        InputStreamReader isr = new InputStreamReader(System.in);
        int randomNam = isr.read();
        System.out.println(randomNam);
        System.out.println((char)randomNam);


    }
}
