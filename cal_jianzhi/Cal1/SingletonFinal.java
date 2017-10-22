package com.learning;

/**
 * Created by huangdonghua on 15/08/2017.
 */

//通过 enum 实现单例模式
public class SingletonFinal {

    private SingletonFinal(){}

    public static SingletonFinal getInstance(){
        return Singleton.INSTANCE.getInstance();
    }

    private static enum Singleton{

        INSTANCE;

        private SingletonFinal singletonFinal;

        //JVM会保证此方法绝对只调用一次
        private Singleton(){
            //内部类可以访问所寄存的class的私有方法
            singletonFinal = new SingletonFinal();
        }

        public SingletonFinal getInstance(){
            return singletonFinal;
        }

    }

    public static void main(String[] args) {

        SingletonFinal singletonFinal1 = SingletonFinal.getInstance();
        SingletonFinal singletonFinal2 = SingletonFinal.getInstance();

        System.out.println(singletonFinal1);
        System.out.println(singletonFinal2);

        if(singletonFinal2 == singletonFinal1){
            System.out.println("实现单例模式");
        }

    }


}
