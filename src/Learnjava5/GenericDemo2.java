package Learnjava5;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo2 {
    public static void main(String[] args) {
        List<?> list1 = new ArrayList<Object>();
        List<?> list2 = new ArrayList<Number>();
        List<?> list3 = new ArrayList<Integer>();

        System.out.println("---------");
//通配符上限 <?extends 类型>
//        List<? extends Number> list4=new ArrayList<Object>();
        List<? extends Number> list5 = new ArrayList<Number>();
        List<? extends Number> list6 = new ArrayList<Integer>();

        System.out.println("--------");
//        通配符下限 <? super 类型>
        List<?super Number> list7=new ArrayList<Object>();
        List<?super Number> list8=new ArrayList<Number>();
//        List<?super Number> list9=new ArrayList<Integer>();
    }
}