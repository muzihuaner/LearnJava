package learnjava3;

import learnjava2.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo6 {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();

        learnjava2.Student s1=new learnjava2.Student("林青霞",30);
        learnjava2.Student s2=new learnjava2.Student("张曼玉",35);
        learnjava2.Student s3=new learnjava2.Student("王祖贤",33);
        //    添加学生
        list.add(s1);
        list.add(s2);
        list.add(s3);
//迭代器
        Iterator<Student> it = list.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+s.getAge());
        }
        System.out.println("-----------");
//        普通for
        for (int i = 0; i < list.size(); i++) {
            Student s=list.get(i);
            System.out.println(s.getName()+s.getAge());
        }
//        增强for
        System.out.println("-----------");
        for (Student s:list){
            System.out.println(s.getName()+s.getAge());
        }

    }

}
