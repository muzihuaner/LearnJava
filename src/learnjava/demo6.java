package learnjava;

import java.util.Scanner;

public class demo6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int a=sc.nextInt();
        System.out.println("请输入第二个整数:");
        int b=sc.nextInt();
        int max=getMax(a,b);
        System.out.println("较大值是："+max);
    }

    public static int getMax(int a, int b) {
        if (a>b){
            return a;
        }else {
            return b;
        }

    }
}
