package Day7;

public class Test {
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        t1.setName("小李");
        t1.setAge(31);
        System.out.println(t1.getName()+t1.getAge());
        t1.teach();

        Teacher t2=new Teacher("小刘",29);
        System.out.println(t2.getName()+t2.getAge());
        t2.teach();

    }
}
