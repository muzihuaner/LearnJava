package LearnJava12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TxtToArrayListDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("D:\\MyProject\\Java\\Demo1\\src\\LearnJava12\\array.txt"));

        ArrayList<String> array=new ArrayList<String>();

//        调用字符缓冲流对象的方法读数据
        String line;
        while ((line= br.readLine())!=null){
            array.add(line);
        }
        br.close();
        for (String s:array){
            System.out.println(s);
        }
    }
}
