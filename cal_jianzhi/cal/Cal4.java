package com.cal;

import java.util.Stack;

/**
 * Created by huangdonghua on 2017/8/24.
 */
public class Cal4 {

    public static class ListNode{

        int val;
        ListNode nxt;

    }

    public static void printByIteration(ListNode root){



        Stack<ListNode> stack = new Stack<>();

        while (root != null){

            stack.push(root);
            root = root.nxt;

        }

        while( !stack.isEmpty() ){

            System.out.print(stack.pop().val+"\t");
        }



    }

    public static void printByrecursion(ListNode root){

        if(root.nxt != null){
            printByrecursion(root.nxt);
        }

        System.out.print(root.val+"\t");

    }


    public static void main(String[] args) {

        ListNode listNode = new ListNode();

        listNode.val = 1;
        listNode.nxt = new ListNode();
        listNode.nxt.val = 2;
        listNode.nxt.nxt = new ListNode();
        listNode.nxt.nxt.val = 3;
        listNode.nxt.nxt.nxt = new ListNode();
        listNode.nxt.nxt.nxt.val = 4;
        listNode.nxt.nxt.nxt.nxt = new ListNode();
        listNode.nxt.nxt.nxt.nxt.val = 5;
        listNode.nxt.nxt.nxt.nxt.nxt = new ListNode();
        listNode.nxt.nxt.nxt.nxt.nxt.val = 6;
        listNode.nxt.nxt.nxt.nxt.nxt.nxt = new ListNode();
        listNode.nxt.nxt.nxt.nxt.nxt.nxt.val = 7;
        listNode.nxt.nxt.nxt.nxt.nxt.nxt.nxt = new ListNode();
        listNode.nxt.nxt.nxt.nxt.nxt.nxt.nxt.val = 8;

        long startTime = System.currentTimeMillis();

        System.out.println("使用 栈的方式&循环：");
        printByIteration(listNode);
        System.out.println();

        long endTime = System.currentTimeMillis();

        System.out.println("使用 栈的方式&循环运行时间：" + (endTime - startTime) +"ms");

        startTime = System.currentTimeMillis();

        System.out.println("使用 递归的方式：");
        printByrecursion(listNode);
        System.out.println();

        endTime = System.currentTimeMillis();

        System.out.println("使用 递归的方式运行时间：" + (endTime - startTime)+"ms");


    }


}
