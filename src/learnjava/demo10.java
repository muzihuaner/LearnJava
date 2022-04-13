package learnjava;

public class demo10 {
    public static void main(String[] args) {
        for (int x=0;x<=20;x++){//鸡翁范围
            for (int y=0;y<=33;y++){//鸡母范围
                int z=100-x-y;//鸡雏
                if (z%3==0&&5*x+3*y+z/3==100){
                    System.out.println("鸡翁数："+x+"鸡母数："+y+"鸡雏数:"+z);
                }
            }
        }
    }
}
