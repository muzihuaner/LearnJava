package LearnJava7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerDemo2 {
    public static void main(String[] args) {
//        键是编号，值是牌
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
//        存储编号
        ArrayList<Integer> array = new ArrayList<Integer>();
        //        定义花色数组
        String[] colors = {"♦", "♣", "♥", "♠"};
//        定义点数数组
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "2"};

//        从0开始向HashList里存储编号和对应的牌，同时把编号存到ArrayList中
        int index = 0;
        for (String color : colors) {
            for (String number : numbers) {
                hm.put(index, color + number);
                array.add(index);
                index++;
            }
        }
        hm.put(index, "小王");
        array.add(index);
        index++;
        hm.put(index, "大王");
        array.add(index);
        index++;

//        洗牌 洗编号
        Collections.shuffle(array);
//        发牌 为了保证编号是排序的,使用TreeList
        TreeSet<Integer> player1Set = new TreeSet<Integer>();
        TreeSet<Integer> player2Set = new TreeSet<Integer>();
        TreeSet<Integer> player3Set = new TreeSet<Integer>();
        TreeSet<Integer> dpSet = new TreeSet<Integer>();

        for (int i = 0; i < array.size(); i++) {
            int x = array.get(i);
            if (i >= array.size() - 3) {
                dpSet.add(x);
            } else if (i % 3 == 0) {
                player1Set.add(x);
            } else if (i % 3 == 1) {
                player2Set.add(x);
            } else if (i % 3 == 2) {
                player3Set.add(x);
            }
        }
//调用看牌方法
        lookPoker("小A同学",player1Set,hm);
        lookPoker("小B同学",player2Set,hm);
        lookPoker("小C同学",player3Set,hm);
        lookPoker("底牌",dpSet,hm);
    }

    //定义看牌方法
    public static void lookPoker(String name, TreeSet<Integer> ts, HashMap<Integer, String> hm) {
        System.out.print(name + "的牌是:");
        for (Integer key : ts) {
            String poker = hm.get(key);
            System.out.print(poker + " ");
        }
        System.out.println();
    }

}
