package learnjava;

public class demo4 {
    public static void main(String[] args) {
//       1.方法名（参数）
//        isEvenNumber(10);
//        2.数据类型 变量名=方法名（参数）
        boolean flag=isEvenNumber(10);
        System.out.println(flag);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
