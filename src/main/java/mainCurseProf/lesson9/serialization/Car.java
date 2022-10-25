package mainCurseProf.lesson9.serialization;

import java.io.Serializable;

public class Car implements Serializable {
    private int price;
    private String color;

    public Car(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return price + " " + color;
    }
}
