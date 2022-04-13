package learnjava3;

import java.util.ArrayList;
import java.util.List;

public class Demo5 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        for (int i :arr) {
            System.out.println(i);
        }
        System.out.println("-----------");
        String []strArray={"hello","hello","java"};
        for (String s:strArray){
            System.out.println(s);
        }
        System.out.println("-----------");
        List<String> list=new ArrayList<String>();
        list.add("hello");
        list.add("world");

        for (String s:list){
            System.out.println(s);
        }
    }
}
