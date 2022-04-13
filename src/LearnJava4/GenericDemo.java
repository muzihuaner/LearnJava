package LearnJava4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class GenericDemo {
    private static Object s;

    public static void main(String[] args) {
//        Collection c=new ArrayList();
        Collection<String> c=new ArrayList<String>();
        
        c.add("Hello");
        c.add("World");
        c.add("Java");
//        c.add(100);

//        遍历集合
//        Iterator it = c.iterator();
        Iterator<String> it = c.iterator();
        while (it.hasNext()){
//            Object obj = it.next();
//            System.out.println(obj);
//            String s=(String)it.next(); //ClassCastException
            String s = it.next();
            System.out.println(s);
        }

    }
}
