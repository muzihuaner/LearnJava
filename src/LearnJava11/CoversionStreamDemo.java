package LearnJava11;

import java.io.*;

public class CoversionStreamDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\MyProject\\Java\\Demo1\\src\\LearnJava11\\BufferedStreamDemo01.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\MyProject\\Java\\Demo1\\src\\LearnJava11\\Copy.java"));

//        读写数据，复制文件
//        方法1：一次读写一个字符数据
//        int ch;
//        while ((ch=br.read())!=-1){
//            bw.write(ch);
//        }
//        方法2：一次读写一个字符数组
        char[] chs = new char[1024];
        int len;
        while ((len = br.read(chs)) != -1) {
            bw.write(chs, 0, len);
        }

        bw.close();
        br.close();

    }
}
