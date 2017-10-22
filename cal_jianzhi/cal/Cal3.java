package com.cal;

/**
 * Created by huangdonghua on 2017/8/23.
 */
public class Cal3 {

    public static char[] replaceBlank(char [] chars,int length){

        if(chars == null || chars.length == 0){
            return null;
        }

        int blank = 0;
        int pre = 0;
        int maxLengh = 0;

        for (int i = 0;i<length;i++){
            if(chars[i] == ' '){
                blank++;
            }
        }

        maxLengh = blank*2 + length;

        char [] temp = new char[maxLengh];

        for(int i = length-1; i >= 0;i--){
            System.out.println(chars[i]);
            if(chars[i] == ' '){
                temp[--maxLengh] = '0';
                temp[--maxLengh] = '2';
                temp[--maxLengh] = '%';
            }else{
                temp[--maxLengh] = chars[i];
            }

        }

        return temp;
    }

    public static void main(String[] args) {

        System.out.println(replaceBlank("sb d".toCharArray(),"sb d".length()));

        System.out.println((3 & 1));


    }

}
