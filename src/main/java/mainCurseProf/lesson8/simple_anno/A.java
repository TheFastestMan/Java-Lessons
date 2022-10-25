package mainCurseProf.lesson8.simple_anno;

public class A {
    public static void print(){
        System.out.println("A");
    }
}
class B extends A{
  //  @Override
public static void print(){
        System.out.println("B");
    }
}
class main{
    public static void main(String[] args) {
A a = new B();
a.print();
    }
}

