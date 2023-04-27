package com.javabase.day001;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date ();
        System.out.println (date.toString ());
        System.out.println (date);

        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
        System.out.println ("Time is："+ ft.format (date));
        System.out.println (date.getTime ());

    }
}
