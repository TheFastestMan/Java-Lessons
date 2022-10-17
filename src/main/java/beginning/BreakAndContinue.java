package beginning;

public class BreakAndContinue {

    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 23;

//        while (a==b){
//            System.out.println("Numbers is equals");
//            break;
//        }

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " Countable");
                continue;
            }
            System.out.println(i +" Uncountable");
        }



    }
}
