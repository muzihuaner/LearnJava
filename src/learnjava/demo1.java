package learnjava;

public class demo1 {
    public static void main(String[] args) {
        int[] arr={11,22,333,44,55,66};
        int max=arr[0];
        for (int x=1;x< arr.length;x++){
            if(arr[x]>max){
                max=arr[x];
            }
        }
        System.out.println("最大为"+max);
    }

}
