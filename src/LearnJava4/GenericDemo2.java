package LearnJava4;

public class GenericDemo2 {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("小白");
        System.out.println(s.getName());

        Teacher t=new Teacher();
        t.setAge(30);
        System.out.println(t.getAge());
        System.out.println("--------------");
        Generic<String> g1=new Generic<String>();
        g1.setT("小白");
        System.out.println(g1.getT());

        Generic<Integer> g2=new Generic<Integer>();
        g2.setT(30);
        System.out.println(g2.getT());
    }
}
