package com.learning;

/**
 * Created by huangdonghua on 15/08/2017.
 */
//version 1.1
public class Singleton2 {
    //getInstance() 这个动作中 获取成员变量都要同步的话 感觉代码变得太极端了
    //影响后期性能
    private static Singleton2 singleton2 = null;
    private Singleton2(){}
    public static Singleton2 getInstance(){
        synchronized (Singleton2.class){
            if(singleton2 != null){
                singleton2 = new Singleton2();
            }
        }
        return singleton2;
    }

}
