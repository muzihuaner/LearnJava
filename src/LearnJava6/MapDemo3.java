package LearnJava6;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String,String>();

        map.put("小A","21");
        map.put("小B","24");
        map.put("小C","25");
//      根据键获取值
        System.out.println(map.get("小A"));
//获取所有键的集合
        Set<String> keySet = map.keySet();
        for (String key:keySet){
            System.out.println(key);
        }
//        获取所有值的集合
        Collection<String> values = map.values();
        for (String value:values){
            System.out.println(value);
        }
    }
}
