package beginning.recution;

public class Main {
    public static void main(String[] args) {
        System.out.println(fuc(3));

    }
    public static int fuc(int n){
        if (n==1)
            return 1;
         return n * fuc(n-1);


    }
}
