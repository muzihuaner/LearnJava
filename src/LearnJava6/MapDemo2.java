package LearnJava6;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String,String>();

        map.put("小A","21");
        map.put("小B","24");
        map.put("小C","25");
//        remove 删除
        System.out.println(map.remove("小C"));
        System.out.println(map.remove("小D"));
//        移除所有键值对元素
//        map.clear();
//        判断是否包含指定的键
        System.out.println(map.containsKey("小A"));
//        判断是否包含指定的值
        System.out.println(map.containsValue("21"));
//        判断集合是否为空
        System.out.println(map.isEmpty());
//        获取集合键值对的个数
        System.out.println(map.size());

    }
}
