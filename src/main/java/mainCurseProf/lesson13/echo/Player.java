package mainCurseProf.lesson13.echo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player implements Runnable{

    Message message;
    List<String> phrases = Arrays.asList("Hey","How are you doing?","Java in not easy","hail the king", "Keep do what you`re doing");

    public Player(Message message){
        this.message = message;
        new Thread(this,"Player").start();
    }
    @Override
    public void run(){
        while (true){
            Double random = Math.random()* phrases.size();
            message.say(phrases.get(random.intValue()));
        }
    }
}
