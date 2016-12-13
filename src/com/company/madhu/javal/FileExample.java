package com.company.madhu.javal;

import java.io.File;

/**
 * Created by msu16 on 04/10/2016.
 */
public class FileExample {

    public static void main (String[] args) {

        File myFile = new File("//Users//msu16//Downloads");

//        boolean stat = myFile.exists();
//
//        long length = myFile.length();
//        System.out.println(stat);
//
//        System.out.println(length);
//
//        myFile.delete();

        String[] foldersLen = myFile.list();
        System.out.println("Folders Length " +foldersLen.length);

        for (int i =0; i < foldersLen.length; i++)
        {
            System.out.println(foldersLen[i]);
        }

    }
}
