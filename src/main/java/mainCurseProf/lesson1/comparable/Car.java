package mainCurseProf.lesson1.comparable;

public class Car implements Comparable {
    private String brand;
    private int price;
    private int speed;

    public Car(String brand, int price, int speed) {
        this.brand = brand;
        this.price = price;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                '}';
    }



    @Override
    public int compareTo(Object o) {
        return this.speed - ((Car)o).speed;
    }
}
