package com.company.madhu.javal;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/**
 * Created by msu16 on 28/09/2016.
 */
public class TryCatch {

    public static void main(String args[]) {
        FileReader fr = null;
        try {
            File file = new File("//Users//msu16//Desktop//file.txt");
            fr = new FileReader(file); char [] a = new char[50];
            fr.read(a);   // reads the content to the array
            for(char c : a)
                System.out.print(c);   // prints the characters one by one
        }catch(IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fr.close();
            }catch(IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
