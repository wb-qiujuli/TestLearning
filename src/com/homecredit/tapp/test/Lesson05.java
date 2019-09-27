package com.homecredit.tapp.test;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qiuju.Li
 * Time: 17:12
 */
public class Lesson05 {
    final int a = 100;
    public void test(){
       // a = 130;  //报错
    }
    public static void main(String[] args) {
        //final 关键字三点：
        // 1.final 修饰类，代表这个类，不能被继承
        // 2.final 修饰方法，代表这个方法，不能被重写
        // 3.final 修饰变量，该变量的值不允许二次更改

        //一：常用类 String，创建字符串的两种方式
        // 1. 直接创建
        String a = "abc";
        System.out.println(a);
        String b = "abc";
        // 2.面向对象思想，通过new 关键字
        String c = new String("abc");
        System.out.println(c);
        //java 中比较   1）== (比较内存地址) 2）equals（比较内容）
        //字符串进行比较时，要用equals
        System.out.println(a.equals(b));
        System.out.println(a==c);
        System.out.println(a.equals(c));
        //java new  堆区生成内存单元  a\b 赋值 在String pull区
        System.out.println("--------------------");
        //String 是不可更改的，没有改变原来的字符串，只是新建了一个
        String d = "abc";
        String e = d;
        System.out.println(d==e);
        d = "333";
        System.out.println(d==e);
        String x = "111";
        System.out.println(x.hashCode());
        x = "333";
        System.out.println(x.hashCode());
        String y = "abcdef";
        String z = "abc"+"def";
        System.out.println(x==z);
//String 类里面有两个常用的构造方法 1） 如何将char 转换成String
  char[] kk = {'1','2','3','4'};
  String mm = new String(kk,0,2); //从0 开始 ，取两个  1,2
  System.out.println(mm);
// 如何将String 转换成  char型数组
        String ab = "I LOVE YOU";
        char[] ilv = ab.toCharArray();
        System.out.println(ilv.length);
        //debug 模式查看变量的值
        char char1 = 97;
        System.out.println(char1);
        //int 对应  ASCII 码    菜鸟教程 基础知识
        // startsWith 方法
String f = "中国人";
String g = "中国人的人";
System.out.println(f.startsWith("中"));
//CompareTo  返回0或1
// System.out.println(f.compareTo(g));  //-2  代表差不差 按位进行比  utf16 编码的简值
        //indexof
        System.out.println(a.indexOf("ac"));  //找到了展示索引下标
        //subString()
        System.out.println(g.substring(4,5));//从0开始算
//replaceALL()  还可用正则表达式
        //全部替换，将旧的字符串替换成新的字符串
        System.out.println(g.replaceAll("中国人","外国人"));
        // 由于String是不可变的，所以需要赋值给其它变量
       String h = g.replaceAll("中国人","外国人");
        System.out.println(h);

        //lastIndexof()
        String w = "abcdechchhhhh";
        System.out.println(w.lastIndexOf("c")); //索引

        //endWith
        //字符串大小写转换  在不确定别人传的是大小写的情况下
        System.out.println(a.toLowerCase());//转换成小写
        System.out.println(a.toUpperCase());//转换成大写
      //忽略大小写的转换  equalsIgnoreCase()
        System.out.println("ABCDEFG".equalsIgnoreCase("abcdefg"));
        System.out.println(a.getBytes()); //字节（二进制流）  文字是String
        //去空格
        a = "   abc"; //去前面的空格
        a = a.trim();
        System.out.println(a);
        a.replaceAll(" ",""); //去中间空格
        //matches() 匹配了规则
        System.out.println(a.matches("[a-zA-Z](1,)"));
        //replace（）只能替换一个
        //Split()  拆分
        String q = "a,b,c,e";
        String [] splitString = a.split(",");
        System.out.println(splitString.toString());
        String l = "我a爱你b中国";
        String [] splitString1= l.split("[a-zA-Z]");
        System.out.println(splitString1.toString());
















    }
}
