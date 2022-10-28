package mainCurseProf.lesson13.youTubeCodeWithJohn;

public class  Main {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            MultiThreadThing multThr = new MultiThreadThing();
            multThr.start();
        }

//        Thread th = new MultiThreadThing();
//        Thread th2 = new MultiThreadThing();
//        th.start();
//        th2.start();

//        th.run();
//        th2.run();
    }
}

