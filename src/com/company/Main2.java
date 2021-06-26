package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {

    public static void main(String[] args) {


        String str = "http://site.com";

        Pattern pattern = Pattern.compile("[a-z]+://[a-z]+\\S[a-z]+");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find() == true) {
            int startIndex = matcher.start();
            int finishIndex = matcher.end();
            String newStr = str.substring(startIndex, finishIndex);

            if (str == newStr){
                System.out.println("ok - eto domen");
            }

            System.out.print(newStr);

        }
    }
}