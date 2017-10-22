package com.cal;

/**
 * Created by huangdonghua on 2017/10/22.
 */
public class Cal7 {

    public static int min(int [] numbers){

        if(numbers == null || numbers.length <= 0){
            throw new RuntimeException("invalid input");
        }

        int lo = 0;
        int li = numbers.length - 1;
        int mid = lo;

        while(numbers[lo] >= numbers[li]){

            if(li - lo == 1){
                return numbers[li];
            }

            mid = lo + (li - lo)/2;

            if(numbers[mid] == numbers[lo] && numbers[mid] == numbers[li]){
                return minInorder(numbers,lo,li);
            }

            if(numbers[mid] >= numbers[lo]){
                lo = mid;
            }else if(numbers[mid] <= numbers[li]){
                li = mid;
            }



        }

        return numbers[mid];

    }

    public static int minInorder(int [] numbers,int lo,int li){

        int  result = numbers[lo];

        for(int i = lo;i < li;i++){
            if(result > numbers[i+1]){
                result = numbers[i+1];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        // 典型输入，单调升序的数组的一个旋转
        int[] array1 = {3, 4, 5, 1, 2};
        System.out.println(min(array1));
        // 有重复数字，并且重复的数字刚好的最小的数字
        int[] array2 = {3, 4, 5, 1, 1, 2};
        System.out.println(min(array2));
        // 有重复数字，但重复的数字不是第一个数字和最后一个数字
        int[] array3 = {3, 4, 5, 1, 2, 2};
        System.out.println(min(array3));
        // 有重复的数字，并且重复的数字刚好是第一个数字和最后一个数字
        int[] array4 = {1, 0, 1, 1, 1};
        System.out.println(min(array4));
        // 单调升序数组，旋转0个元素，也就是单调升序数组本身
        int[] array5 = {1, 2, 3, 4, 5};
        System.out.println(min(array5));
        // 数组中只有一个数字
        int[] array6 = {2};
        System.out.println(min(array6));
        // 数组中数字都相同
        int[] array7 = {1, 1, 1, 1, 1, 1, 1};
        System.out.println(min(array7));
        System.out.println(min(array6));
        // 输入NULL
        System.out.println(min(null));

    }


}
