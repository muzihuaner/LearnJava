package LearnJava6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Students> hm = new HashMap<String, Students>();

        Students s1 = new Students("小A", 21);
        Students s2 = new Students("小B", 22);
        Students s3 = new Students("小C", 23);

        hm.put("001", s1);
        hm.put("002", s2);
        hm.put("003", s3);

//        方式1 键找值
        Set<String> keySet = hm.keySet();
        for (String key : keySet) {
            Students value = hm.get(key);
            System.out.println(key + "," + value.getName() + "," + value.getAge());
        }
        System.out.println("-----------");
//        遍历方法2

        Set<Map.Entry<String, Students>> entrySet = hm.entrySet();
        for (Map.Entry<String, Students> en : entrySet) {
            String key = en.getKey();
            Students value = en.getValue();
            System.out.println(key + "," + value.getName() + "," + value.getAge());
        }
    }
}
