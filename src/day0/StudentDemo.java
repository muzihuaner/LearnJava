package day0;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "小明";
        s.setAge(-12);
        s.show();
        s.setAge(12);
        s.show();
    }
}
