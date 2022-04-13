package Day8;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }
    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}
