package day3;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串数据:");
        sc.nextLine();
//        Ctrl+Alt+v  自动补全
        String line = sc.nextLine();
        System.out.println("你输入的数据是:"+line);
    }
}
