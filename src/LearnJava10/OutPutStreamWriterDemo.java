package LearnJava10;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutPutStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("D:\\MyProject\\Java\\Demo1\\src\\LearnJava10\\osw.txt"));
//        osw.write(97);
////        刷新流
//        osw.flush();

//        写入一个字符数组
        char[]chs={'a','b','c','d','e'};
        osw.write(chs,0, chs.length);
//        写一个字符串
        osw.write("HelloWorld");
        osw.write("HelloWorld",1,3);

        osw.close();
    }
}
