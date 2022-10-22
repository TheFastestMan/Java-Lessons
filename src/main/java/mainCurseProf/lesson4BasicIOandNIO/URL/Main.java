package mainCurseProf.lesson4BasicIOandNIO.URL;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            URL currency = new URL("https://learnwithnews.com/2021/04/22/japan-to-release-radioactive-water-into-the-ocean-level-3/");
            BufferedReader br = new BufferedReader(new InputStreamReader(currency.openStream()));

            String str;
            while ((str = (String) br.readLine())!=null){
                System.out.println(str);
            }


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
