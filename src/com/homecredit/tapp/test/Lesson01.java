package com.homecredit.tapp.test;

/**
 * Created with IntelliJ IDEA.
 * Description:使用3种以上方法输出1+2+…10的和
 * User: Qiuju.Li
 * Date: 2019-09-13
 * Time: 16:27
 */
public class Lesson01 {
    public static void main(String[] args) {
        //方法一
        int sum1= 1+2+3+4+5+6+7+8+9+10;
        System.out.println("方法一：1+2+...10的和为"+sum1);
        //方法二
        int sum2 = 0;
        for (int i = 0;i<= 10; i++){
            sum2 = sum2 + i;
        }
        System.out.println("方法二：1+2+...10的和为"+sum2);
        //方法三
        int sum3 = (1+10)*10/2;
        System.out.println("方法三：1+2+...10的和为"+sum3);
        //方法四
        int count = 10;//循环上限
        int j = 1,sum4 = 0;
        while (j <= count){
            sum4 = sum4 + j;
            j++;
        }
        System.out.println("方法四：1+2+...10的和为"+sum4);
       //测试修改
    }
}
