package com.peak.chao.动态代理;

/**
 * Created by 003 on 2018/7/13.
 */
public class Master implements Person {
    @Override
    public void searchHouse() {
        System.err.println("我是主人，我要找房子，一室一厅!"+Num.getInstance().a);
    }
}
