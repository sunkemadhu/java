package com.company.madhu.javal;
import java.util.regex.*;
/**
 * Created by msu16 on 23/09/2016.
 */
public class PAtternExample {



        public static void main(String[] args) {
            String text    =
                    "This is the text to be searched for occurrences of the http:// pattern.";

            String patternString = ".*http://.*";

            Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);

            Matcher matcher = pattern.matcher(text);

            boolean matches = matcher.matches();

            System.out.println("matches = " + matches);
        }
}