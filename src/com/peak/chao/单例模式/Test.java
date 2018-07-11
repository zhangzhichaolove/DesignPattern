package com.peak.chao.单例模式;

/**
 * Created by 003 on 2018/7/11.
 * 在内部创建一个实例，构造器全部设置为private，所有方法均在该实例上改动，在创建上要注意类的实例化只能执行一次，可以采用许多种方法来实现，如Synchronized关键字，或者利用内部类等机制来实现。
 */
public class Test {

    public static void main(String[] args) {
        System.err.println(Singleton.getInstance());
        System.err.println(Singleton.getInstance());
        System.err.println(Singleton2.getInstance());
        System.err.println(Singleton2.getInstance());
        System.err.println(Singleton3.getInstance());
        System.err.println(Singleton3.getInstance());
    }

}

/**
 * 内部式，饱汉
 */
class Singleton {
    private Singleton() {
    }

    private static class SingletonHolder {
        private static Singleton value = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.value;
    }
}

/**
 * 恶汉式
 */
class Singleton2 {
    private static Singleton2 instance = new Singleton2();

    private Singleton2() {
    }


    public static Singleton2 getInstance() {
        return instance;
    }
}

/**
 * 饱汉式
 */
class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {
    }


    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}