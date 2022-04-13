package learnjava3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
//        创建集合对象
        List<String> list=new ArrayList<String>();
//        添加元素,有序&可重复
        list.add("hello");
        list.add("world");
        list.add("world");
        list.add(1,"java");
        System.out.println(list);
        System.out.println(list.remove(1));
        System.out.println(list.set(1,"javaee"));
        System.out.println(list.get(1));

////        迭代器
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()){
//            String s = it.next();
//            System.out.println(s);
//        }
//        遍历集合
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

    }
}
