package com.company.madhu.javal;

import java.util.*;

/**
 * Created by msu16 on 30/09/2016.
 */
class TestCollection1{
    public static void main(String args[]){

        ArrayList<String> al=new ArrayList<String>();//creating arraylist
        al.add("Ravi");//adding object in arraylist
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        String[] madhu = {"madhu","sudan","rao"};

        int[] num = {1,2,34,5};

        System.out.println(madhu[1]);

        System.out.println(num[1]);


        Iterator itr=al.iterator();//getting Iterator from arraylist to traverse elements
        while(itr.hasNext()){
            System.out.println(itr.next());

        }
    }
}