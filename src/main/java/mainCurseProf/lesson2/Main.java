package mainCurseProf.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Integer> arr = new ArrayList();
        BufferedReader bufRed = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < 3; i++) {
            System.out.println("Write a num" + i);
            Integer x = Integer.valueOf(bufRed.readLine());
            arr.add(x);
        }

        for (Integer integer : arr) {
            System.out.println(integer);
        }




    }
}
