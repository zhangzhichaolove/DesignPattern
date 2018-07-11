package com.peak.chao.原型模式;

/**
 * Created by 003 on 2018/7/11.
 * 原型模式就是讲一个对象作为原型，使用clone()方法来创建新的实例。
 */
public class Test {

    public static void main(String[] args) {
        //浅复制,基本类型被复制，可以修改后不干扰原值，引用对象地址还是一个对象，所以当对象内容改变后会影响被克隆对象的值。
        Prototype pro = new Prototype();
        pro.setAge(10);
        ProtoModel model = new ProtoModel(1);
        pro.setModel(model);
        Prototype pro1 = (Prototype) pro.clone();
        pro1.getModel().setType(2);//此时值将源对象的内容干扰了
        pro1.setAge(15);
        System.err.println(pro);
        System.err.println(pro1);
        fun();
    }

    public static void fun() {
        //深复制
        Prototype2 pro = new Prototype2();
        pro.setAge(10);
        ProtoModel model = new ProtoModel(1);
        pro.setModel(model);
        Prototype2 pro1 = (Prototype2) pro.clone();
        pro1.getModel().setType(2);//此时值将源对象的内容干扰了
        pro1.setAge(15);
        System.err.println(pro);
        System.err.println(pro1);

    }

}
