package mainCurseProf.lesson13Thread.part2.runnable;

public class MyRun implements Runnable{
    private String word;
    private int delay;

    public MyRun(String word, int delay) {
        this.word = word;
        this.delay = delay;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    @Override
    public void run() {
        for (; ;) {
            System.out.println(word + " ");
            try {
                Thread.sleep(delay);
            }   catch (InterruptedException e) {
                     e.printStackTrace();
                }
        }
    }
}
