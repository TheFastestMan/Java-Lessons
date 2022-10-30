package mainCurseProf.lesson14lambda.example;

public class Lamp implements ElectricityConsumer {
    public void lightOn(){
        System.out.println("Лампа зажглась ");
    }

    @Override
    public void electricityOn(Object sent) {
        lightOn();
    }
}
