package mainCurseProf.lesson9.serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
    File file = new File("C:\\Users\\79376\\IdeaProjects\\Java-Lessons\\src\\main\\java\\mainCurseProf\\lesson9/Main.java");
    Car c = new Car(100, "BMW");
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
         ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
        oos.writeObject(c);

        Car car = (Car) ois.readObject(); // десериализуем object
        System.out.println(car);
    } catch (FileNotFoundException ex) {
        ex.printStackTrace();
    } catch (IOException | ClassNotFoundException ex) {
        ex.printStackTrace();
    }

    }
}