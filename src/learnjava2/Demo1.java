package learnjava2;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {24, 69, 88, 57, 13};
        System.out.println("排序前:" + arrayToString(arr));
        System.out.println("排序后：" + arrayToString(Bubble(arr)));
    }

    public static int[] Bubble(int[] arr) {  //冒泡排序

        for (int i = 0; i < arr.length - 1; i++) {
            boolean falg = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int q = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = q;
                    falg = true;
                }
            }
            if (falg = false) {
                break;
            }
        }
        return arr;
    }


    public static String arrayToString(int[] arr) {  //输出列表方法
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i] + ",");
            }
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }
}
