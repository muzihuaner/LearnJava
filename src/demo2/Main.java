package demo2;

public class Main {
    public static void main(String[] args) {
        System.out.println("XX学号为XXXXX，购物小票如下：");
        String shoppingReceipt = "牛奶:8.5元,香蕉3.6元，酱油:2.8元,面包:10.2元";
        PriceToken lookPriceMess = new PriceToken();
        System.out.println(shoppingReceipt);
        double sum =lookPriceMess.getPriceSum(shoppingReceipt);
        System.out.printf("共消费: %-7.2f元",sum);
//        int amount = lookPriceMess.getGoodsAmount(shoppingReceipt);
//        double aver = lookPriceMess.getAverPrice(shoppingReceipt);
//        System.out.printf("\n商品数目:%d,平均价格:%-7.2f",amount,aver);
    }
}
