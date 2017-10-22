package com.cal;

/**
 * Created by huangdonghua on 2017/10/18.
 */
public class Cal5 {

//   二叉树节点
    public static class BinaryTreeNode {
        int value;
        BinaryTreeNode left;
        BinaryTreeNode right;
    }

    public static BinaryTreeNode Construct(int [] preOrder,int [] inOrder){

        BinaryTreeNode binaryTreeNode = null;

        if( preOrder == null || inOrder == null || preOrder.length != inOrder.length || inOrder.length == 0 ){
            return null;
        }

        return Construct(preOrder,0,preOrder.length-1,inOrder,0,inOrder.length);
    }

    public static BinaryTreeNode Construct(int [] preOrder ,int ps ,int pe ,int [] inOrder ,int is ,int ie){

        if( ps > pe){
            return null;
        }

        int value = preOrder[ps];
        int index = 0;

        while(index <= ie && inOrder[index] != value){
            index++;
        }

        if( index > ie){
            throw new RuntimeException("Invalid input");
        }

        BinaryTreeNode binaryTreeNode = new BinaryTreeNode();

        binaryTreeNode.value = value;

        binaryTreeNode.left = Construct(preOrder,ps + 1,ps + index - is,inOrder,is,index - 1);
        binaryTreeNode.right = Construct(preOrder,ps + index - is + 1,pe,inOrder,index + 1,ie);

        return binaryTreeNode;
    }

    public static void printTree(BinaryTreeNode binaryTreeNode){
        if(binaryTreeNode != null){
            printTree(binaryTreeNode.left);
            System.out.print(binaryTreeNode.value + " ");
            printTree(binaryTreeNode.right);
        }
    }

    private static void test1() {
        int[] preorder = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] inorder = {4, 7, 2, 1, 5, 3, 8, 6};
        BinaryTreeNode root = Construct(preorder, inorder);
        printTree(root);
    }

    private static void test2() {
        int[] preorder = {1, 2, 3, 4, 5};
        int[] inorder = {5, 4, 3, 2, 1};
        BinaryTreeNode root = Construct(preorder, inorder);
        printTree(root);
    }

    private static void test3() {
        int[] preorder = {1, 2, 3, 4, 5};
        int[] inorder = {1, 2, 3, 4, 5};
        BinaryTreeNode root = Construct(preorder, inorder);
        printTree(root);
    }

    private static void test4() {
        int[] preorder = {1};
        int[] inorder = {1};
        BinaryTreeNode root = Construct(preorder, inorder);
        printTree(root);
    }

    private static void test5() {
        int[] preorder = {1, 2, 4, 5, 3, 6, 7};
        int[] inorder = {4, 2, 5, 1, 6, 3, 7};
        BinaryTreeNode root = Construct(preorder, inorder);
        printTree(root);
    }

    private static void test6() {
        Construct(null, null);
    }

    private static void test7() {
        int[] preorder = {1, 2, 4, 5, 3, 6, 7};
        int[] inorder = {4, 2, 8, 1, 6, 3, 7};
        BinaryTreeNode root = Construct(preorder, inorder);
        printTree(root);
    }

    public static void main(String[] args) {
        test1();
        System.out.println();
        test2();
        System.out.println();
        test3();
        System.out.println();
        test4();
        System.out.println();
        test5();
        System.out.println();
        test6();
        System.out.println();
        test7();
    }

}

