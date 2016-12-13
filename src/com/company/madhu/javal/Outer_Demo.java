package com.company.madhu.javal;


/**
 * Created by msu16 on 30/09/2016.
 */
//class Outer_Demo {
//    int num;
//
//    // inner class
//    private class Inner_Demo {
//        public void print() {
//            System.out.println("This is an inner class");
//        }
//    }
//
//    // Accessing he inner class from the method within
//    void display_Inner() {
//        Inner_Demo inner = new Inner_Demo();
//        inner.print();
//    }
//
//
//
//
//
//}


class Outer_Demo {
    // private variable of the outer class
    private int num = 175;

    // inner class
    public class Inner_Demo {
        public int getNum() {
            System.out.println("This is the getnum method of the inner class");
            return num;
        }
    }
}