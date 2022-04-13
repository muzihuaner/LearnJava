package com.company;

public class ErrorExcepiton extends Exception{
    String message;
    public ErrorExcepiton(){
        message="收入为负数或支出是正数，数据非法！！！";
    }
    public String warnMess(){
        return message;
    }
}
