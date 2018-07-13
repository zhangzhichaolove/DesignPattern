package com.peak.chao.动态代理;

/**
 * Created by 003 on 2018/7/13.
 */
public class Test {

    public static void main(String[] args) {
        Person person = new HomeLink().getInstance(new Master());
        person.searchHouse();
    }
}
