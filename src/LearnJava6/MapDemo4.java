package LearnJava6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String,String>();

        map.put("小A","21");
        map.put("小B","24");
        map.put("小C","25");
//遍历方法1
////        获取所有键集合
//        Set<String> keySet = map.keySet();
//        for (String key:keySet){
////            根据键找值
//            String value = map.get(key);
//            System.out.println(key+","+value);
//        }

//        遍历方法2
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> en:entrySet){
            System.out.println(en.getKey()+","+en.getValue());
        }
    }
}
