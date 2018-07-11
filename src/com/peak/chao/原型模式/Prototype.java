package com.peak.chao.原型模式;

public class Prototype implements Cloneable {

    private ProtoModel model = new ProtoModel(1);
    private String name;
    private int age;

    public Prototype() {
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
    protected Object clone() {
        Object sc = null;
        try {
            sc = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sc;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "model=" + model +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}