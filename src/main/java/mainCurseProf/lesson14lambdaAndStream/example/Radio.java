package mainCurseProf.lesson14lambdaAndStream.example;

public class Radio implements ElectricityConsumer{

    public void radioOn(){
        System.out.println("Радио включено ");
    }

    @Override
    public void electricityOn(Object sent) {
        radioOn();
    }
}
