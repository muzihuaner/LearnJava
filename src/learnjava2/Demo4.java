package learnjava2;

public class Demo4 {
    public static void main(String[] args) {
//        装箱：把基本数据类型装换为包装类类型
        Integer i = Integer.valueOf(100);
        Integer ii=100;//自动装箱
//        拆箱:把包装类类型转化为基本数据类型
//        ii+=200;  自动拆箱
        ii=ii.intValue()+200;
        System.out.println(ii);
        Integer iii=null;
        if (iii!=null){
            iii+=300;
        }
    }
}
