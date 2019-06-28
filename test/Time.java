package com.francis.tmall.test;



import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Time {
    public static void main(String[] args) throws Exception{
        String today = "2019-6-17";

        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
        Date now =sdf.parse(today);
        Date d = new Date();

        System.out.println(now.getTime());
        System.out.println(d.getTime());

    }
}
