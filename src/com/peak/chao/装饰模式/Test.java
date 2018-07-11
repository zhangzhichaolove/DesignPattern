package com.peak.chao.装饰模式;

/**
 * Created by 003 on 2018/7/11.
 * 给一类对象增加新的功能，装饰方法与具体的内部逻辑无关。
 */
public class Test {
    public static void main(String[] args) {
        Decorator decorator = new Decorator(new TestImpl());
        decorator.method();
    }
}

interface Source {
    void method();
}

class Decorator implements Source {

    private Source source;

    public Decorator(Source source) {
        this.source = source;
    }

    public void decotate1() {
        System.err.println("装饰方法运行了");
    }

    @Override
    public void method() {
        decotate1();
        source.method();
    }
}

class TestImpl implements Source {

    @Override
    public void method() {
        System.err.println("源方法执行");
    }
}
