package day5;

public class Zi extends Fu{
    public int height=175;
    public void method(){
        int height=180;
        System.out.println(age);
//        本方法
        System.out.println(height);
//        本类
        System.out.println(this.height);
//        父类
        System.out.println(super.height);
    }
    public Zi(){
        super();
    };
    public Zi(int age){
        System.out.println("zi带参数方法被调用");
    }

}
