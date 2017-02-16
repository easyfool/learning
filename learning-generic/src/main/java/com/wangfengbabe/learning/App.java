package com.wangfengbabe.learning;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println(args.length);
        System.out.println("Hello World!");
        Matcher matcher = Pattern.compile("\\w+").matcher("java is very easy");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        int i = 0;
        while (matcher.find(i)) {
            System.out.println(matcher.group() + "\t");
            i++;
        }
        Locale[] locales = Locale.getAvailableLocales();
        for (Locale locale : locales) {
            System.out.println(locale.getDisplayCountry() + "=" + locale.getCountry() + " " + locale.getDisplayLanguage() + "=" + locale.getLanguage());
        }

        Locale myLocale = Locale.CHINA;
        ResourceBundle bundle = ResourceBundle.getBundle("locale/mess", myLocale);
        System.out.println(bundle.getString("hello"));


//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNextLine()) {
//            System.out.println(scanner.nextLine());
//        }


    }
}
