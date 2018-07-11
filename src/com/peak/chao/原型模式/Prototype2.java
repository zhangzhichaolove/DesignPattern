package com.peak.chao.原型模式;

/**
 * Created by 003 on 2018/7/11.
 */
public class Prototype2 implements Cloneable {

    private ProtoModel model = new ProtoModel(1);
    private String name;
    private int age;

    public Prototype2() {
        System.err.println("调用了构造。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ProtoModel getModel() {
        return model;
    }

    public void setModel(ProtoModel model) {
        this.model = model;
    }


    @Override
    protected Prototype2 clone() {
        Prototype2 sc = null;
        try {
            sc = (Prototype2) super.clone();
            sc.model = (ProtoModel) model.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sc;
    }

    @Override
    public String toString() {
        return "Prototype2{" +
                "model=" + model +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
