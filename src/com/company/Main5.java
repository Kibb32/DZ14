package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main5 {
    public static void main(String[] args) {


        String str = "'12:59', '23:41', '00:12', '00:00','09:15','24.00', '25.00', '12.60', '12.93', '41.93' ";

        Pattern pattern = Pattern.compile("[0-2]\\d:[0-5]\\d.");
        Matcher matcher = pattern.matcher(str);



        while (matcher.find() == true) {
            int startIndex = matcher.start();
            int finishIndex = matcher.end();
            String newStr = str.substring(startIndex, finishIndex);

            System.out.print(newStr);


    }
}
}
