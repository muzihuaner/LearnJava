package LearnJava10;

import java.io.*;

public class CopyJavaDemo01 {
    public static void main(String[] args) throws IOException {
//        InputStreamReader isr=new InputStreamReader(new FileInputStream("D:\\MyProject\\Java\\Demo1\\src\\LearnJava10\\OutPutStreamWriterDemo.java"));
//        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("D:\\MyProject\\Java\\Demo1\\src\\LearnJava10\\Copy.java"));

//        改进
        InputStreamReader isr=new FileReader("D:\\MyProject\\Java\\Demo1\\src\\LearnJava10\\OutPutStreamWriterDemo.java");
        OutputStreamWriter osw=new FileWriter("D:\\MyProject\\Java\\Demo1\\src\\LearnJava10\\Copy.java");


        char[] chs = new char[1024];
        int len;
        while ((len = isr.read(chs)) != -1) {
            osw.write(chs, 0, len);
        }
        isr.close();
        osw.close();
    }
}
