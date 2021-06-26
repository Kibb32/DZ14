package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = "192.168.1.255";

        Pattern pattern = Pattern.compile("\\b((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.|$)){4}\\b");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find() == true) {
            int startIndex = matcher.start();
            int finishIndex = matcher.end();
            String newStr = str.substring(startIndex, finishIndex);

            System.out.print(newStr);


        }
    }
}

