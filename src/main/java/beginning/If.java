package beginning;

public class If {
    public static void main(String[] args) {
        int a = 110;
        int b = 1110;

        if (a==b){
            a++;
            System.out.println(a+b);
        } else if (a<b){
            b--;
            System.out.println(a-b);
        }
        else {
            System.out.println("not found");
        }

    }
}
