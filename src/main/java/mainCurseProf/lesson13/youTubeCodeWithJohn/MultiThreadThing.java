package mainCurseProf.lesson13.youTubeCodeWithJohn;

public class MultiThreadThing extends Thread {

    @Override
    public void run(){
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
