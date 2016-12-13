package com.company.madhu.javal;

import java.util.*;
class TestCollection2{
    public static void main(String args[]){
        ArrayList<String> al=new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        for(String se:al)
            System.out.println(se);
    }
}