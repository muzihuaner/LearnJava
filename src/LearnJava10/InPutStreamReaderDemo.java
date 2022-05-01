package LearnJava10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InPutStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\MyProject\\Java\\Demo1\\src\\LearnJava10\\OutPutStreamWriterDemo.java"));

//        一次读取一个字符数据
//        int ch;
//        while ((ch= isr.read())!=-1){
//            System.out.print((char)ch);
//        }
//        一次读取一个字符数组数据
        char[] chs = new char[1024];
        int len;
        while ((len = isr.read(chs)) != -1) {
            System.out.print(new String(chs, 0, len));
        }

        isr.close();
    }
}
