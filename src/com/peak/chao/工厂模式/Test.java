package com.peak.chao.工厂模式;

/**
 * Created by 003 on 2018/7/11.
 * 常用的工厂模式是静态工厂，利用static方法，作为一种类似于常见的工具类Utils等辅助效果，一般情况下工厂类不需要实例化。
 */
public class Test {

    public static void main(String[] args) {
        System.err.println(StaticFactory.getA());
        System.err.println(StaticFactory.getB());
        System.err.println(StaticFactory.getC());
    }

}

/**
 * 公共接口
 */
interface food {
}

class A implements food {
}

class B implements food {
}

class C implements food {
}

/**
 * 工厂类，生产需要的对象
 */
class StaticFactory {

    private StaticFactory() {
    }

    public static food getA() {
        return new A();
    }

    public static food getB() {
        return new B();
    }

    public static food getC() {
        return new C();
    }
}