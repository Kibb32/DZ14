package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        String str = "2+3 223 2223";

        Pattern pattern = Pattern.compile("2\\D3");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find() == true) {
            int startIndex = matcher.start();
            int finishIndex = matcher.end();
            String newStr = str.substring(startIndex, finishIndex);

            System.out.println(newStr);

        }
    }
}