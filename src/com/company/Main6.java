package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str;
        str = input.nextLine();

        Pattern pattern = Pattern.compile("[1-3][0-9].[0-1]\\d.\\d{4}");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find() == true) {
            int startIndex = matcher.start();
            int finishIndex = matcher.end();
            String newStr = str.substring(startIndex, finishIndex);

            System.out.print(newStr);


        }
    }
}

