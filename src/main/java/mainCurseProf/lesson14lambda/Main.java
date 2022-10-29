package mainCurseProf.lesson14lambda;

public class Main {
    public static void main(String[] args) {
        Operation operation = (x, y) -> x+y; int sum = operation.calculate(12,12);
        System.out.println(sum);



    }

}

interface Operation{
    int calculate(int x, int y);
}

//    Operation operation = new Operation() {
//        @Override
//        public int calculate(int x, int y) {
//            return x+y;
//        }
//    }; int sum = operation.calculate(12,12);
//        System.out.println(sum);
