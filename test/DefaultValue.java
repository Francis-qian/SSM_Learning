package com.francis.tmall.test;

class value{
    int a;
}

public class DefaultValue {
    public static void test(value value){
        System.out.println(value.a);
    }

    public static void main(String[] args) {
        value v=new value();
        System.out.println(v.a);
    }
}
