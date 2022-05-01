package LearnJava9;

import java.util.Scanner;

public class diguiDemo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int i = sc.nextInt();
        int result = jc(i);
        System.out.println(i+"的阶乘为:"+result);
    }
    public static int jc(int n){
//        在方法内部判断该变量的值是否为1
        if (n==1){
            return 1;
        }else {
            return n*jc(n-1);
        }
    }
}
