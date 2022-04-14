package LearnJava7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(30);
        list.add(20);
        list.add(40);
        System.out.println(list);
        System.out.println("---------排序---------");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("---------逆序---------");
        Collections.reverse(list);
        System.out.println(list);
        System.out.println("---------随机排列---------");
        Collections.shuffle(list);
        System.out.println(list);

    }
}
