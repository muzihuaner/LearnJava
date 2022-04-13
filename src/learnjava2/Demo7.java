package learnjava2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Demo7 {
    public static void main(String[] args) throws ParseException {
//        格式化 Date到String
        Date d=new Date();
//        SimpleDateFormat sdf=new SimpleDateFormat();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sdf.format(d);
        System.out.println(s);
//        格式化 String到Date
        String ss="2022-03-31 11:11:11";
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = sdf2.parse(ss);
        System.out.println(dd);

    }
}
