package com.company;

public class Jisuan {
    public void income(int in,int out) throws ErrorExcepiton {
        if(in<=0||out>=0||in+out<=0){
            throw new ErrorExcepiton();//抛出异常
        }
        int netIncome=in+out;
        System.out.println("现在账户有"+netIncome+"元");
    }
}
