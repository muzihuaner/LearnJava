package day4;
//字数统计
import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();

//        统计三种字符个数
        int bigCount=0;
        int smallCount=0;
        int numberCount=0;

        for(int i=0;i<line.length();i++){
           char ch= line.charAt(i);
//            判断属于哪种类型
            if (ch>='A'&&ch<='Z'){
                bigCount++;
            }else if (ch>='a'&&ch<='z'){
                smallCount++;
            }if (ch>='0'&&ch<='9'){
                numberCount++;
            }
        }
        System.out.println("大写个数:"+bigCount+","+"小写个数"
                +smallCount+','+"数字个数"+numberCount);
    }
}
