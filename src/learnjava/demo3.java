package learnjava;

public class demo3 {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        getMax(a,b);
    }
    public static void getMax(int a,int b) {

        if (a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
}
