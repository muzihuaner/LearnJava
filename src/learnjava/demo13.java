package learnjava;

import java.util.Scanner;

public class demo13 {
    public static void main(String[] args) {
        int []arr= {19, 28, 37, 46, 50};
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int input=sc.nextInt();
        int index=getIndex(arr,input);
        System.out.println("索引值为:"+index);
    }
    public static int getIndex(int []arr,int input){
        int index=-1;
        for (int i=0;i< arr.length;i++){
            if (input==arr[i]){
                index=i;
                break;
            }
        }
        return index;
    }

}
