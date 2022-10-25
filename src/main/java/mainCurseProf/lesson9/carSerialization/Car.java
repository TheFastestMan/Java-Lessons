package mainCurseProf.lesson9.carSerialization;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable {
    private int price;
    private String model;
    private Engine engin;

    public Car(int price, String model, Engine engin) {
        this.price = price;
        this.model = model;
        this.engin = engin;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngin() {
        return engin;
    }

    public void setEngin(Engine engin) {
        this.engin = engin;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", engin=" + engin +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && Objects.equals(model, car.model) && Objects.equals(engin, car.engin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, model, engin);
    }
}
class Engine implements Serializable {
    private int power;

    public Engine(){};

    public Engine(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                '}';
    }
}