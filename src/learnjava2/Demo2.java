package learnjava2;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        int []arr={24,69,88,57,13};
        System.out.println("排序前:"+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后:"+ Arrays.toString(arr));
    }
}
