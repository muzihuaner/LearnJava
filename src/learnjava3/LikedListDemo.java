package learnjava3;

import java.util.LinkedList;

public class LikedListDemo {
    public static void main(String[] args) {
//        创建集合对象
        LinkedList<String> linkedList=new LinkedList<String>();
        linkedList.add("Hello");
        linkedList.add("World");
        linkedList.add("java");
//在列表开头or结尾加入元素
        linkedList.addFirst("javaee");
        linkedList.addLast("javaee");
//得到第一个or最后一个元素
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);

    }
}
