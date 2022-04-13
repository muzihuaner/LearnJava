package learnjava;
//反转数组元素
public class demo14 {
    public static void main(String[] args) {
        int []arr={19,28,37,46,50};
        for (int start=0,end= arr.length-1;start<=end;start++,end--){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
//        遍历数组
        printArry(arr);
    }
    public static void printArry(int[]arr){
        System.out.print("[");
        for (int x=0;x< arr.length;x++){
            if (x==arr.length-1){
                System.out.print(arr[x]);
            }else {
                System.out.print(arr[x]+", ");
            }
        }
        System.out.println("]");
    }
}
