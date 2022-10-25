package mainCurseProf.lesson9.carSerialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        File f = new File("C:\\Users\\79376\\IdeaProjects\\Java-Lessons\\src\\main\\java\\mainCurseProf\\lesson9/Text.txt");
        Car car = new Car(200,"BMW",new Engine(121));

        try
                (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
                 ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            oos.writeObject(car);

            Car c = (Car) ois.readObject();

            System.out.println(c);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
