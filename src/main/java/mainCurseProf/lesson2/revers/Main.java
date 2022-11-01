package mainCurseProf.lesson2.revers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader red = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            System.out.println(i + " write");
            String str = red.readLine();
            list.add(str);
        }

        for (int i = 0; i < list.size(); i++) {
            int a = list.size() - i - 1;
            System.out.println(a);
        }
    }
}
