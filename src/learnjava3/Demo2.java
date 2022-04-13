package learnjava3;

import learnjava2.Student;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<Student> c= new ArrayList<>();

        learnjava2.Student s1=new learnjava2.Student("林青霞",30);
        learnjava2.Student s2=new learnjava2.Student("张曼玉",35);
        learnjava2.Student s3=new learnjava2.Student("王祖贤",33);
        //    添加学生
        c.add(s1);
        c.add(s2);
        c.add(s3);

        for (int i = 0; i < c.size(); i++) {
            Student s = c.get(i);
            System.out.println(s.getName()+" "+s.getAge());
        }

    }
}
