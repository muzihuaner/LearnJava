package learnjava3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
        //        创建集合对象
        List<String> list=new ArrayList<String>();
//        添加元素,有序&可重复
        list.add("hello");
        list.add("world");
        list.add("world");
        Iterator<String> it = list.iterator();
//        判断是否存在元素"word",如果有就加一个"javaee"
//        while (it.hasNext()){
//            String s = it.next();
//            if (s.equals("world")) {
//                list.add("javaee");
//            }
//        }
        for (int i = 0; i < list.size(); i++) {
            String s=list.get(i);
            if (s.equals("world")){
                list.add("javaee");
            }
        }
        System.out.println(list);
    }
}
