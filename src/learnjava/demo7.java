package learnjava;

import java.util.Scanner;

public class demo7 {
    public static void main(String[] args) {
        System.out.println("请输入星期数：");
        Scanner sc=new Scanner(System.in);
        int week=sc.nextInt();
//        if(week<1||week>7){
//            System.out.println("你输入的数据有误！");
//        }else if (week==1){
//            System.out.println("跑步");
//        }else if (week==2){
//            System.out.println("游泳");
//        }else if (week==3){
//            System.out.println("慢走");
//        }else if (week==4){
//            System.out.println("单车");
//        }else if (week==5){
//            System.out.println("拳击");
//        }else if (week==6){
//            System.out.println("爬山");
//        }else if (week==7){
//            System.out.println("吃饭");
//        }
//
        switch (week){
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("跑步");
                break;
            case 3:
                System.out.println("跑步");
                break;
            case 4:
                System.out.println("跑步");
                break;
            case 5:
                System.out.println("跑步");
                break;
            case 6:
                System.out.println("跑步");
                break;
            case 7:
                System.out.println("跑步");
                break;
            default:
                System.out.println("你输入的星期数有误！");
        }
    }
}
