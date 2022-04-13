package day4;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s=sc.nextLine();
//        遍历每一个字符
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }
}
