package LearnJava7;

import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo {
    public static void main(String[] args) {
//    创建一个牌盒
        ArrayList<String> array=new ArrayList<String>();
/*
* 往牌盒里装牌
*    ♦2、♦3、♦4...♦K、♦A
*    ♣2....
*    ♥2.....
*    ♠2.....
*    小王、大王
* */
//        定义花色数组
        String[] colors={"♦","♣","♥","♠"};
//        定义点数数组
        String[] numbers={"2","3","4","5","6","7","8","9","10","J","Q","K"};

        for (String color:colors){
            for (String number:numbers){
                array.add(color+number);
            }
        }
        array.add("小王");
        array.add("大王");
//        System.out.println(array);

//        洗牌
        Collections.shuffle(array);
//        System.out.println(array);
//        发牌
        ArrayList<String> player1=new ArrayList<String>();
        ArrayList<String> player2=new ArrayList<String>();
        ArrayList<String> player3=new ArrayList<String>();
        ArrayList<String> dpArray=new ArrayList<String>();

        for (int i = 0; i < array.size(); i++) {
            String poker = array.get(i);
            if (i> array.size()-3){
                dpArray.add(poker);
            }else if (i%3==0){
                player1.add(poker);
            }else if (i%3==1){
                player2.add(poker);
            }else if(i%3==2){
                player3.add(poker);
            }
        }

//            看牌
        lookPoker("小A同学",player1);
        lookPoker("小B同学",player1);
        lookPoker("小C同学",player1);
        lookPoker("底牌是",dpArray);
    }
//    看牌的方法
    public static void lookPoker(String name,ArrayList<String> array){
        System.out.println(name+"的牌是:");
        for (String poker:array){
            System.out.print(poker+" ");
        }
       System.out.println();
    }
}
