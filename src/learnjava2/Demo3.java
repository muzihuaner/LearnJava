package learnjava2;

import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
//        定义一个字符串
        String s = "91 27 46 38 50";
//        把字符串中的数字存储到一个int类型的数组中
        String[] strArray = s.split(" ");
//        for (int i = 0; i < strArray.length; i++) {
//            System.out.println(strArray[i]);
//        }
        int[] arr = new int[strArray.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArray[i]);
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        排序
        Arrays.sort(arr);
//        把排序后的数组中的元素进行拼接得到一个字符串
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i== arr.length-1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(" ");
            }
        }
        String result=sb.toString();
        System.out.println("result:"+result);
    }
}
