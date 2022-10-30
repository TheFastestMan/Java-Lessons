package mainCurseProf.lesson14lambda.example;

public class Radio implements ElectricityConsumer{

    public void radioOn(){
        System.out.println("Радио включено ");
    }

    @Override
    public void electricityOn(Object sent) {
        radioOn();
    }
}
