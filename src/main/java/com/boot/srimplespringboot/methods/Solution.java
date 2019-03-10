package com.boot.srimplespringboot.methods;

import java.util.Arrays;

public class Solution {

  /**
   * 替换空格
   * 第一种方法：常规方法。利用String.charAt(i)以及String.valueOf(char).equals(" "
   * )遍历字符串并判断元素是否为空格。是则替换为"%20",否则不替换
   */
  public static String replaceSpace(String str) {

    int length = str.length();
    // System.out.println("length=" + length);
    StringBuffer result = new StringBuffer();
    for (int i = 0; i < length; i++) {
      char b = str.charAt(i);
      if (String.valueOf(b).equals(" ")) {
        result.append("");
      } else {
        result.append(b);
      }
    }
    return result.toString();

  }

  /**
   * 第二种方法：利用API替换掉所用空格，一行代码解决问题
   */
  public static String replaceSpace2(String str) {

    return str.toString().replaceAll("\\s", "");
  }

  public static void test(){
    String[] strs = { "customer", "car", "cat" };
    // 数组长度
    int len = strs.length;
    // 用于保存结果
    StringBuilder res = new StringBuilder();
    // 给字符串数组的元素按照升序排序(包含数字的话，数字会排在前面)
    Arrays.sort(strs);
    int m = strs[0].length();
    int n = strs[len - 1].length();
    int num = Math.min(m, n);
    System.out.println("m"+m);
    System.out.println("n"+n);
    System.out.println("num"+num);
  }

  public static void main(String[] args) {
   // System.out.println(replaceSpace2("haohong test k....."));
    test();
  }
}