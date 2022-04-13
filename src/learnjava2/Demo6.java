package learnjava2;

import java.util.Date;

public class Demo6 {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1.getTime());
        System.out.println(d1.getTime() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年        ");
//        long time=1000*60*60;
        long time=System.currentTimeMillis();

        d1.setTime(time);
        System.out.println(d1);
    }
}
