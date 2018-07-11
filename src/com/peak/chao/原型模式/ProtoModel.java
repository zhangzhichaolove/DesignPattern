package com.peak.chao.原型模式;

/**
 * Created by 003 on 2018/7/11.
 */
public class ProtoModel implements Cloneable{

    private int type = 0;

    public ProtoModel(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "ProtoModel{" +
                "type=" + type +
                '}';
    }
}
