package com.peak.chao.动态代理;

/**
 * Created by 003 on 2018/7/13.
 */
public class Num {

    private static Num instance = new Num();
    public int a = 1;

    public static Num getInstance() {
        return instance;
    }

}
