package day4;

public class StringDemo01 {
    public static void main(String[] args) {
//        空字符串对象
        String s1=new String();
        System.out.println("s1:"+s1);
//        字符串对象
        char[]chs= {'a','b','c'};
        String s2=new String(chs);
        System.out.println("s2:"+s2);
//
        byte[]bhs={97,98,99};
        String s3=new String(bhs);
        System.out.println("s3:"+s3);

        String s4="abc";
        System.out.println("s4:"+s4);
    }
}
