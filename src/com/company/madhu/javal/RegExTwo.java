package com.company.madhu.javal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by msu16 on 23/09/2016.
 */
public class RegExTwo {

    public static void main(String[] args) {

        String text    =
                "This is the text to be searched " +
                        "for occurrences of the http:// pattern.";

        String patternString = "This is the";

        Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        System.out.println("lookingAt = " + matcher.lookingAt());
        System.out.println("matches   = " + matcher.matches());
    }
}