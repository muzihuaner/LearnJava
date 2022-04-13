package LearnJava6;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String,String>();
//        使用put添加元素
        map.put("001","A同学");
        map.put("002","B同学");
        map.put("003","C同学");

        System.out.println(map);
    }
}
