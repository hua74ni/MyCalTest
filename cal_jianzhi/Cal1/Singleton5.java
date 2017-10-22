package com.learning;

/**
 * Created by huangdonghua on 15/08/2017.
 */
public class Singleton5 {

    //下面的这个1.6版是老版《Effective Java》中推荐的方式。
    //上面这种方式，仍然使用JVM本身机制保证了线程安全问题；
    // 由于 SingletonHolder 是私有的，除了 getInstance() 之外没有办法访问它，
    // 因此它只有在getInstance()被调用时才会真正创建；同时读取实例的时候不会进行同步，没有性能缺陷；也不依赖 JDK 版本。

    private static class SingletonHolder{
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    private Singleton5(){}

    public static final Singleton5 getInstance(){
        return SingletonHolder.INSTANCE;
    }

}
