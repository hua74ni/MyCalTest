package com.learning;

/**
 * Created by huangdonghua on 15/08/2017.
 */
// version 1.0
public class Singleton1 {

//    这个程序存在比较严重的问题，因为是全局性的实例，所以，在多线程情况下，
//    所有的全局共享的东西都会变得非常的危险，这个也一样，在多线程情况下，
//    如果多个线程同时调用getInstance()的话，那么，
//    可能会有多个进程同时通过 (singleton== null)的条件检查

    private static Singleton1  singleton = null;
    private Singleton1(){}
    public static  Singleton1 getInstance(){
        if(singleton == null){

            singleton = new Singleton1();

        }

        return singleton;
    }

}
