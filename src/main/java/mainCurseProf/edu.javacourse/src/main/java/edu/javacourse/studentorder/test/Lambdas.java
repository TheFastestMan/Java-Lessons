package edu.javacourse.studentorder.test;

import java.util.PrimitiveIterator;

public class Lambdas {
    public static void main(String[] args) {

        Printable lambdaPrint = () -> System.out.println("Girls, girls, girls");
        printSmth(lambdaPrint);


    }
    static void printSmth(Printable printable){
        printable.print();
    }
}
//    Printable pr = new Printable(){
//        @Override
//        public void print(){
//            System.out.println("Hello girls");
//        }
//    };
