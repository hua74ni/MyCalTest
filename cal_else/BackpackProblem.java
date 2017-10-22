package com.cal_else;

/**
 * Created by huangdonghua on 2017/8/25.
 */
public class BackpackProblem {

    public static int dynamicProgramming(int weight){

        int rows =  4;
        int columns = 6;
        int [][] numbers = new int[rows][columns];

        int c[] = {0,1,2,3};
        int w[] = {0,60,100,120};

        int temp1;
        int temp2;


        for (int i = 1 ; i < columns;i++){

            for(int j = 1;j < rows;j++){

                if(i < c[j]){
                    numbers[j][i] = numbers[j-1][i];

                }else{
                    temp1 = numbers[j-1][i];
                    temp2 = w[j] + numbers[j-1][i-c[j]];

                    if(temp1 > temp2){
                        numbers[j][i] = temp1;
                    }else{
                        numbers[j][i] = temp2;
                    }
                }
            }
        }

//        for (int i = 0; i < rows;i++){
//            for (int j = 0 ;j<columns;j++){
//                System.out.print(numbers[i][j]+"\t");
//            }
//            System.out.println();
//        }

        return numbers[rows-1][weight];

    }

    public static void main(String[] args) {

        System.out.println("背包"+3+"最大重量可以获取最大的收益是 : "+dynamicProgramming(3));

        System.out.println("背包"+4+"最大重量可以获取最大的收益是 : "+dynamicProgramming(4));

        System.out.println("背包"+5+"最大重量可以获取最大的收益是 : "+dynamicProgramming(5));
    }

}
