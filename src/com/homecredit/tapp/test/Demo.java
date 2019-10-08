package com.homecredit.tapp.test;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qiuju.Li
 * Date: 2019-10-08
 * Time: 21:40
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
       // System.out.println(str);
        char [] array = str.toCharArray();
        //数组转化成arraylist
        ArrayList array_change = new ArrayList();
        for (int k = 0;k < array.length;k++){
            array_change.add(array[k]);
        }
        ArrayList temp = new ArrayList();//存值
        int [] count = {};
        int num = 0;
        int n = 0;
        for (int i = 0 ;i < array_change.size();i++){
            temp.add(array_change.get(n));
            for (int j = 0 ;j <temp.size();j++){
                if (array_change.get(i) == temp.get(n)) {
                   System.out.print("hello");
                }
                else {
                    n++;
                    temp.add(array_change.get(n));
                }
            }
}
        System.out.println(temp);
    }
}
