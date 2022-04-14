package LearnJava7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        ArrayList<Student> array=new ArrayList<Student>();

        Student s1=new Student("xiaoA",21);
        Student s2=new Student("xiaoB",22);
        Student s3=new Student("xiaoC",23);
        Student s4=new Student("xiaoD",21);

        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
//使用比较器排序
        Collections.sort(array, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
//                按照年龄从小到大排列，年龄相同，按姓名排序
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()):num;
                return num2;
            }
        });
        for (Student s:array){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
