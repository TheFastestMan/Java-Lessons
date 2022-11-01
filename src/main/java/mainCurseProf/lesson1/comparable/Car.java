package mainCurseProf.lesson1.comparable;

public class Car {
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

    public void compareToPrice(Car c){
        int comPrice = this.price - c.price;
        System.out.println(comPrice);

//        if(comSpeed<=0){
//            return 0;
//        }else if(comSpeed>0){
//            return comSpeed;
//        } else if(comPrice<=0){
//            return 0;
//        }else
//            return comPrice;

    }

    public int compareToSpeed(Car c){
        int comSpeed = this.speed - c.speed;
        return comSpeed;
    }
}
