package com.test.first;
//递归法计算兔子数量
public class TestRabbit {
    public static void main(String[] args) {
        int num = caculatRabbit(8);
        System.out.println(num);
        System.out.println("兔子数量");
    }

    public static int caculatRabbit(int i){
        if(i==1||i==2){
            return 1;
        }else{
            return(caculatRabbit(i-1)+caculatRabbit(i-2));
        }
    }
}
