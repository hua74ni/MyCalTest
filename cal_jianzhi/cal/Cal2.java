package com.cal;

/**
 * Created by huangdonghua on 16/08/2017.
 */
public class Cal2 {

    public static boolean find(int [][] arr,int num){

        if(arr == null ){
            return false;
        }

        int rows = arr.length;
        int cols = arr[1].length-1;

        int i = 0;
        int j = cols;

        while(i < rows && j >= 0){

            if(num == arr[i][j]){
                return true;
            }
            if(num < arr[i][j]){
                j--;
                if(j == -1)
                    break;
            }
            if(num > arr[i][j]){
                i++;
            }

        }

        return false;

    }

    public static void main(String[] args) {

        int matrix [][] = {
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        };

        System.out.println(find(matrix, 7));    // 要查找的数在数组中
        System.out.println(find(matrix, 5));    // 要查找的数不在数组中
        System.out.println(find(matrix, 1));    // 要查找的数是数组中最小的数字
        System.out.println(find(matrix, 15));   // 要查找的数是数组中最大的数字
        System.out.println(find(matrix, 0));    // 要查找的数比数组中最小的数字还小
        System.out.println(find(matrix, 16));   // 要查找的数比数组中最大的数字还大
        System.out.println(find(null, 16));     // 健壮性测试，输入空指针


    }

}
