package mainCurseProf.lesson13.echo;

public class Main {
    public static void main(String[] args) {
        Message message = new Message("Hi" , false);
        new Echo(message);
        new Player(message);

    }
}
