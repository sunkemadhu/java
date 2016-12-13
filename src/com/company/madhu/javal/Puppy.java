package com.company.madhu.javal;

/**
 * Created by msu16 on 19/09/2016.
 */
public class Puppy {

    int puppyAge;
   // static int puppyAg = 3;

    public  Puppy(String name) {
        System.out.println("Name chosen is: "+ name);
    }

    public  void setAge( int age ){
        puppyAge = age;

    }
    public void getAge(){
        System.out.println("Puppy's age is:"+puppyAge);
    }
public static void main (String args[]){
    Puppy myPuppy = new Puppy("TOMMY");

    myPuppy.setAge(2);
    myPuppy.getAge();
    System.out.println("Variable Value: "+myPuppy.puppyAge);

    //System.out.println("Variable Value: "+puppyAg);

    }
}
