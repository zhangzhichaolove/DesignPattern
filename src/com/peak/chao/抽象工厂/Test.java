package com.peak.chao.抽象工厂;

/**
 * Created by 003 on 2018/7/11.
 * 一个基础接口定义了功能，每个实现接口的子类就是产品，然后定义一个工厂接口，实现了工厂接口的就是工厂，这时候，接口编程的优点就出现了，我们可以新增产品类（只需要实现产品接口），
 * 只需要同时新增一个工厂类，客户端就可以轻松调用新产品的代码。

 　　抽象工厂的灵活性就体现在这里，无需改动原有的代码，毕竟对于客户端来说，静态工厂模式在不改动StaticFactory类的代码时无法新增产品，如果采用了抽象工厂模式，就可以轻松的新增拓展类。
 */
public class Test {
    public static void main(String[] args) {
        System.err.println(new FactoryForA().get());
        System.err.println(new FactoryForB().get());
    }

}

interface food {
}

class A implements food {
}

class B implements food {
}

interface produce {
    food get();
}

class FactoryForA implements produce {
    @Override
    public food get() {
        return new A();
    }
}

class FactoryForB implements produce {
    @Override
    public food get() {
        return new B();
    }
}