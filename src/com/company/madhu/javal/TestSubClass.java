package com.company.madhu.javal;

/**
 * Created by msu16 on 27/09/2016.
 */
public class TestSubClass {
    public static void main(String args[]) {
        SuperClass b = new SubClass();   // Animal reference but Dog object
        b.returnName();   // runs the method in Dog class
    }
}
