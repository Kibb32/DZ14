package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main4 {

    public static void main(String[] args) {


        String str = "http://site.ru, http://site.com ".replaceAll("http://site.ru, http://site.com ","<a href=\"http://site.ru\">site.ru</a>");

            System.out.println(str);

        }
    }
