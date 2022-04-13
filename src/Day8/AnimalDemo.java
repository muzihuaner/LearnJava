package Day8;

public class AnimalDemo {
    public static void main(String[] args) {
        Cat cat1=new Cat();
        cat1.setName("加菲猫");
        cat1.setAge(5);
        System.out.println(cat1.getName()+cat1.getAge());

        Cat cat2=new Cat("小猫",6);
        System.out.println(cat2.getName()+cat2.getAge());
        cat2.catchMouse();
    }
}
