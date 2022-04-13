package day6.Phone;

public class NewPhone extends Phone {
    public void call(String name) {
        System.out.println("开启视频");
        super.call(name);
    }
}
