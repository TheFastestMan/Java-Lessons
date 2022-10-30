package mainCurseProf.lesson14lambdaAndStream.example;

public class Main {
    private static void fire (Object sent){
        System.out.println("ПОЖАР!");
    }

    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Radio radio = new Radio();
        Switcher switcher = new Switcher();

        switcher.addElectricityListener(lamp);
        switcher.addElectricityListener(radio);

        String message = "FIRE!";

        switcher.addElectricityListener(sent -> System.out.println(message));
        switcher.addElectricityListener(Main::fire);

        switcher.switchOn();


    }
}
