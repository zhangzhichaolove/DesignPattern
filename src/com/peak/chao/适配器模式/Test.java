package com.peak.chao.适配器模式;

/**
 * Created by 003 on 2018/7/11.
 * 有一个插座，这个插座是三个口的，但是我们手上只有两个触角的插头，一种笨方法就是直接强行把两个触角掰弯，插进去（这种事情我就做过），还有一种方法就是找一个转换头来。
 * 将一个类的接口，转换成客户期望的另一个接口。适配器让原本接口不兼容的类可以合作无间。
 * 适配器模式的作用就是在原来的类上提供新功能
 */
public class Test {

    //现在这快地方只有 三个口 的 插 座 ，但是插头是两个触角的，需要一个适配器
    public static void main(String[] args) {
        //1、定义一个两个触角的插头，这个是本来自带的

        TwoInterface twoInterface = new RealTwo();

        //2、定义一个适配器，使得三个口的插座可以为两个触角的插头提供电源
        ThreeInterface threeInterface = new ThreeToTwoAdapter(twoInterface);

        //3、提供电源
        threeInterface.OfferPowerForThree();
    }
}

interface ThreeInterface {
    public void OfferPowerForThree(); //三个口的插头有 一 个 功能，能够为三个触角的插头提供电源
}

interface TwoInterface {
    public void OfferPowerForTwo();//两个口的插头有一个功 能，能够为两个触角的插头提供电源
}


class RealTwo implements TwoInterface {
    @Override
    public void OfferPowerForTwo() {
        System.out.println("我可以为两个触角的插头提供电源！");
    }
}

class ThreeToTwoAdapter implements ThreeInterface {

    TwoInterface twoInterface;

    public ThreeToTwoAdapter(TwoInterface twoInterface) {
        this.twoInterface = twoInterface;
    }

    @Override
    public void OfferPowerForThree() {
        twoInterface.OfferPowerForTwo();
    }

}

