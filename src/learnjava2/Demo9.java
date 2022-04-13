package learnjava2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo9 {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<>();
//        System.out.println(c.add("Hello"));
//        添加元素
        c.add("Hello");
        c.add("world");
//        去掉某个元素
//        c.remove("world");
//        去掉所有元素
//        c.clear();
//        判断某个元素是否在集合中
//        System.out.println(c.contains("world"));
//        判断集合是否为空
//        System.out.println(c.isEmpty());
//        返回集合中的迭代器
        Iterator<String> it = c.iterator();
//        返回迭代中的下一个元素
        System.out.println(it.next());
//        判断迭代器是否有更多元素
        if (it.hasNext()){
            System.out.println(it.next());
        }
//        用while改进循环
        while (it.hasNext()){
//            System.out.println(it.next());
            String s=it.next();
            System.out.println(s);
        }
        System.out.println(c);
    }
}
