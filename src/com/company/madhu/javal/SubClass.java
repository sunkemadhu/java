package com.company.madhu.javal;

/**
 * Created by msu16 on 27/09/2016.
 */
public class SubClass extends SuperClass{

    public void returnName() {
        //super.returnName();
        System.out.println("sudan");
    }
    public static void main (String[] args)
    {
        SuperClass name = new SubClass();
        name.returnName();
       // System.out.println(name);
//
        SubClass nameTwo = new SubClass();
        nameTwo.returnName();
//        System.out.println(nameTwo);
//
//        SubClass nameT = new SubClass();
//        nameT.returnName();
//        System.out.println(nameT);


    }


}
