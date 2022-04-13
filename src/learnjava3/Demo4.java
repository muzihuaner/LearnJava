package learnjava3;

import java.util.*;

public class Demo4 {
    public static void main(String[] args) {
//  通过List集合的ListIterator（）方法得到
        List<String> list=new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");

        ListIterator<String> lit= list.listIterator();
        while (lit.hasNext()){
            String s = lit.next();
            System.out.println(s);
        }
        System.out.println("----------------------");
//        逆向遍历
        while (lit.hasPrevious()){
            String s = lit.previous();
            System.out.println(s);
        }
        Iterator<String> it = list.iterator();
        while (lit.hasNext()){
            String s=lit.next();
            if (s.equals("world")){
                lit.add("javaee");
            }
        }
        System.out.println(list);
    }
}
