package com.cal;

import java.util.Stack;

/**
 * Created by huangdonghua on 2017/10/21.
 */
public class Cal6 <T> {

    public static class ImitateQueue <T> {

        private Stack<T> stackAAD = new Stack<T>();
        private Stack<T> stackDel = new Stack<T>();

        public void appendTail(T t){
            stackAAD.add(t);
        }

        public T deleteHead(){
            if(stackDel.isEmpty()){
                while (!stackAAD.isEmpty()){
                    stackDel.add(stackAAD.pop());
                }
            }

            if(stackDel.isEmpty()){
                throw new RuntimeException("stack no elements");
            }

            return stackDel.pop();
        }

    }

    public static void main(String[] args) {

        ImitateQueue<Integer> imitateQueue = new ImitateQueue<Integer>();

        imitateQueue.appendTail(1);
        imitateQueue.appendTail(2);
        System.out.println(imitateQueue.deleteHead());
        System.out.println(imitateQueue.deleteHead());
        System.out.println(imitateQueue.deleteHead());

    }

}
