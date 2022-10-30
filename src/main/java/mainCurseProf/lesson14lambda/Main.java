package mainCurseProf.lesson14lambda;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
       long l1 = System.nanoTime();
        User user1 = new User() {
            @Override
            public void speak() {
                System.out.println("Hello");
            }
        };
        long l2 = System.nanoTime();

        long l3 = System.nanoTime();
        User user2 = () -> System.out.println("Hello");
        long l4 = System.nanoTime();

        System.out.println(l2-l1);
        System.out.println(l4-l3);

    }

}
@FunctionalInterface
interface User{
    public void speak();
}

//    Operation add = (x,y)->x+y;
//    Operation min = (x,y)->x-y;
//    Operation div = (x,y)->x/y;
//    Operation mult = (x,y)->x*y;
//
//        System.out.println(add.calculate(12, 1));
//                System.out.println(min.calculate(32, 4));
//                System.out.println(div.calculate(645, 6));
//                System.out.println(mult.calculate(155, 65));




//    Operation operation = new Operation() {
//        @Override
//        public int calculate(int x, int y) {
//            return x+y;
//        }
//    }; int sum = operation.calculate(12,12);
//        System.out.println(sum);
//Operation operation = (x, y) -> x+y; int sum = operation.calculate(12,12);
//        System.out.println(sum);