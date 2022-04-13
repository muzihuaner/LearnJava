package learnjava2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo10 {
    public static void main(String[] args) {
        Collection<Student> c=new ArrayList<Student>();

        Student s1=new Student("林青霞",30);
        Student s2=new Student("张曼玉",35);
        Student s3=new Student("王祖贤",33);
//    添加学生
        c.add(s1);
        c.add(s2);
        c.add(s3);
//遍历集合
        Iterator<Student> it = c.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+s.getAge());
        }
    }
}
