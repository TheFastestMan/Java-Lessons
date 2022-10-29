package mainCurseProf.lesson13Thread.youTubeCodeWithJohn;

public class MultiThreadThing extends Thread {

    @Override
    public void run(){
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
