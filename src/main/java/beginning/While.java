package beginning;

public class While {
    public static void main(String[] args) {

        int x = 50;
        int y = 20;
        int z = 100;
        boolean a = x == y;
                         // Цикл while выролняется до тех пор пока условие выдает истину
        while (x > y){
            y = y+5;
            System.out.println("+5 "+ y);
        }


    }
}