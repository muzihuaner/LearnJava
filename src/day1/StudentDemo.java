package day1;

public class StudentDemo {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("小明");
        s.setAge(30);
        s.show();
        System.out.println(s.getName()+"----"+s.getAge());
    }

}
