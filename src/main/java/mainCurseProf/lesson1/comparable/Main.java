package mainCurseProf.lesson1.comparable;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("BMW",5000, 250);
        Car car2 = new Car("Ford",3500,200);
        Car car3 = new Car("Lada",1000,180);
        Car car4 = new Car("Tesla",5500,350);
        Car car5 = new Car("Fiat",2500,200);

        car1.compareToPrice(car2);

        System.out.println(car4.compareToSpeed(car5));


    }

}
