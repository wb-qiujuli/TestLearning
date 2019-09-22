package com.homecredit.tapp.test;
import java.util.Scanner;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qiuju.Li
 * Date: 2019-09-22
 * Time: 20:18
 */
public class Lesson02 {
    //题目一：某学校要将学生分数转换为A/B/C三个等级输出，90分以上为A，80分到90分为B，80分及以下为C。请设计程序实现此功能。
    //输入分数：89/91/66/70
    public void score(int num){
        if (num >90)
            System.out.println("成绩为A");
        else if (num >80)
            System.out.println("成绩为B");
        else
            System.out.println("成绩为C");
    }
    public static void main(String[] args) {
        //方法一
       // Lesson02 score = new Lesson02();
        //score.score(89);
       // score.score(91);
        //score.score(66);
        //score.score(70);
        //方法二
//        Scanner scanner = new Scanner (System.in);
//        System.out.println("请输入分数：");
//        int num = scanner.nextInt();
//        Lesson02 score1 = new Lesson02();
//        score1.score(num);
//        题目二：定义一个数组，1，4，2，5，7，8，3
//        输出数组中最大的数
//        Tips:
//        int[] arr={1,4,2,5,7,8,3};
//        获取数组的第i个元素arr[i]
//        int[] arr ={1,4,2,5,7,8,3};
//        int max= arr[0];
//        for (int i = 1;i<arr.length-1;i++){
//            if (max < arr[i])
//                max = arr [i];
//        }
//        System.out.println(max);

//       题目三： 交换两个数
//        int a = 1;
//        int b = 2;
//        交换两个数，使a=2, b=1;
//        int tmp = 0,a =1,b=2;
//        tmp = a;
//        a = b;
//        b = tmp;
//        System.out.println("a = "+ a);
//        System.out.println("b = "+ b);

//        题目四：实现选择交换排序
//        算法思想：
//        1.从数组中选择最大的，与首位数交换。
//        2.从剩余数组中选择最大的，与次位交换。
//        3.从剩余数组中选择最大的，与第三位交换。
        int[] arr={1,4,2,5,7,8,3};
//        for (int i = 0 ;i< 7;i++){
//            int max = i;
//            for (int j = i+1;j<7;j++){
//                if (arr[max] < arr[j])
//                    max = j;
//            }
//            int tmp = arr[max];
//            arr[max] = arr[i];
//            arr[i] = tmp;
//        }
//        for(int i = 0 ; i <= arr.length -1;i++) {
//            System.out.println(arr[i]);
//
//        }
//        冒泡排序
        for (int j = 0 ;j <7 ; j++)
        for (int i = 0 ; i< 6 ;i++){
            int min = arr [i];
            if (arr [i+1] < arr [i]){
                arr [i] = arr [i+1];
                arr [i+1] = min;
            }

        }
        for(int i = 0 ; i < 7;i++) {
            System.out.println(arr[i]);
        }
 }

    }

