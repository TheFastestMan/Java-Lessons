package mainCurseProf.lesson4BasicIOandNIO;

import java.io.ByteArrayInputStream;

public class Test1 {
    public static void main(String[] args) {
        byte[] arr = new byte[] {12,43,65,23,87,78};
        ByteArrayInputStream bais = new ByteArrayInputStream(arr);
        int tmp;
        while ((tmp = bais.read())!= -1){
            System.out.print(tmp+" ");
        }
        System.out.println();/////////////////////////

        String str = "Hello";
        byte[] arr2 = str.getBytes();
        ByteArrayInputStream bais2 = new ByteArrayInputStream(arr2,0,5);
        int tmp2;
        while ((tmp2 = bais2.read())!= -1){
            System.out.print((char)tmp2+" ");
        }

    }
}
