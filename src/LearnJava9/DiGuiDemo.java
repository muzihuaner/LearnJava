package LearnJava9;

public class DiGuiDemo {
    public static void main(String[] args) {
//        不死神兔问题，求第20个月兔子的对数
//        每个月兔子对数1、1、2、3、5、8....
        int []arr=new int[20];

        arr[0]=1;
        arr[1]=1;

        for (int i=2;i< arr.length;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(arr[19]);
        System.out.println(f(20));//StackOverflowError
    }
/*
* 递归解决问题，首先就是定义一个方法：
* 定义一个方法f(n),表示第n个月的兔子对数
* 那么，第n-1个月兔子对数该如何表示？f(n-1)
* 第n-2个月兔子对数该如何表示？f(n-2)
* */

    public static int f(int n){
        if ((n==1||n==2)){
            return 1;
        }else {
            return f(n-1)+f(n-2);
        }
    }
}
