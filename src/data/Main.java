package data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner input =new Scanner(System.in);
        System.out.println("请输入你的出生日期：（YYYY-MM-DD）:");
        String birthday=input.next();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate=df.parse(birthday);
        long birthdayDateTime=birthdayDate.getTime();
        String nowTime=df.format(new Date());
        long todayTime=new Date().getTime();
        long Time=todayTime-birthdayDateTime;
        long day = Time / (24 * 60 * 60 * 1000);
        long hour = (Time / (60 * 60 * 1000) - day * 24);
        long min = ((Time / (60 * 1000)) - day * 24 * 60 - hour * 60);
        long s = (Time / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
        System.out.println("XX学号为XXXXX，出生日期为："+birthday+"，现在时间为："+nowTime+"，出生日期到现在相隔了"+day+"天，"+hour+"时，"+min+"分，"+s+"秒。");
    }

}
