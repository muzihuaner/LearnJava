package LearnJava6;

import learnjava2.Student;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<Students, String> hm = new HashMap<Students, String>();

        Students s1 = new Students("小A", 21);
        Students s2 = new Students("小B", 22);
        Students s3 = new Students("小C", 23);
        Students s4 = new Students("小C", 23);
        hm.put(s1, "SXJZLG");
        hm.put(s2, "SX");
        hm.put(s3, "SXJZ");
        hm.put(s4, "SXJZXY");

        Set<Students> keySet = hm.keySet();
        for (Students key : keySet) {
            String value = hm.get(key);
            System.out.println(key.getName() + "," + key.getAge() + "," + value);
        }
    }
}
