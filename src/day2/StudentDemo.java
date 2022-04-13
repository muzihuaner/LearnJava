package day2;

public class StudentDemo {
    public static void main(String[] args) {
        Student s=new Student();
        s.show();
        Student s2=new Student("小明");
        s2.show();
        Student s3=new Student(13);
        s3.show();
        Student s4=new Student("小明",13);
        s4.show();
    }
}
