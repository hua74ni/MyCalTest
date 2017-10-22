package com.learning;

/**
 * Created by huangdonghua on 15/08/2017.
 */
public class Singleton4 {

    //这种玩法的最大问题是——当这个类被加载的时候，new Singleton() 这句话就会被执行，就算是getInstance()没有被调用，类也被初始化了。

    private static Singleton4  singleton = new Singleton4();

    private Singleton4(){}

    public static  Singleton4 getInstance(){
        return singleton;
    }

}
