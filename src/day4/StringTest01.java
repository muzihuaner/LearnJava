package day4;

import java.util.Scanner;

public class StringTest01 {
    public static void main(String[] args) {
//        定义用户名&密码
        String username = "admin";
        String password = "admin";
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名:");
            String name = sc.nextLine();
            System.out.println("请输入密码:");
            String pwd = sc.nextLine();
            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("登录成功!");
                break;
            } else {
                if (2 - i == 0) {
                    System.out.println("你的账户已被锁定,请一会再试.");
                } else {
                    System.out.println("登录失败,你还有" + (2 - i) + "次机会");
                }
            }
        }
    }
}
