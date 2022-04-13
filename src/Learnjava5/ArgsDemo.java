package Learnjava5;

public class ArgsDemo {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
    }
//a是数组
    private static int sum(int b,int... a) {
//        return 0;
        int sum= 0;
        for (int i:a){
            sum+=i;
        }
        return sum;
    }
}
