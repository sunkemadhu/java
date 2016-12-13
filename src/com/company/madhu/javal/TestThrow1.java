package com.company.madhu.javal;

/**
 * Created by msu16 on 26/09/2016.
 */
public class TestThrow1{
    static void validate(int age){
        if(age<18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("welcome to vote");
    }
    public static void main(String args[]){
        validate(19);
        System.out.println("rest of the code...");
    }
}