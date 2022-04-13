package data;

import java.text.SimpleDateFormat;
import java.util.Date;

public class mian2 {
    public static void main(String[] args) {

            try {
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date nowTime=new Date();
                String date1=String.format("%tF %tI:%tM:%tS",nowTime,nowTime,nowTime,nowTime);
                String date2=String.format("%tY年%<tm月%<td日",nowTime);
                Date now = df.parse(date1);//当前时间
                Date date = df.parse("2000-03-24 11:30:24");//过去
                long l = now.getTime() - date.getTime();
                long day = l / (24 * 60 * 60 * 1000);
                long hour = (l / (60 * 60 * 1000) - day * 24);
                long min = ((l / (60 * 1000)) - day * 24 * 60 - hour * 60);
                long s = (l / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
                System.out.println("XX学号为XXXXX，出生日期为：2000年03月24日，现在时间为："+date2+"，出生日期到现在相隔了");
                System.out.println("" + day + "天" + hour + "小时" + min + "分" + s + "秒");
            } catch (Exception e) {

        }
    }
}
