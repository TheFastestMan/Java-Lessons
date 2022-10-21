package advence.lambda;

public class TestLambda {
    static void tset(Word w){
        System.out.println(w.drow("Strem"));
    }

    public static void main(String[] args) {
        tset((String s)->{return s.length();});

    }
}
interface Word{
    int drow(String str);
}
