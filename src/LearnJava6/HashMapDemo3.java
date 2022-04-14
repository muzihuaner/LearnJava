package LearnJava6;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

//统计字符串中每个字符出现的次数
public class HashMapDemo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串:");
        String line = sc.nextLine();
//        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
//        TreeMap排序
        TreeMap<Character,Integer> hm=new TreeMap<Character,Integer>();
        //遍历字符串，得到每一个字符
        for (int i = 0; i < line.length(); i++) {
            char key = line.charAt(i);
//            拿到的每一个字符作为键到HashMap中找对应的值
            Integer value = hm.get(key);
            if (value==null){
//                如果不存在就把该字符作为key
                hm.put(key,1);
            }else {
//                如果存在就数量+1,然后重新存储该字符和值
                value++;
                hm.put(key,value);
            }

        }
        StringBuilder sb=new StringBuilder();
        Set<Character> keySet = hm.keySet();
        for (Character key:keySet){
            Integer value= hm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
