package day6.Phone;

public class PhoneDemo extends Phone{
    public static void main(String[] args) {
        Phone p=new Phone();
        p.call("小明");

        NewPhone ph=new NewPhone();
        ph.call("小红");
    }
}
