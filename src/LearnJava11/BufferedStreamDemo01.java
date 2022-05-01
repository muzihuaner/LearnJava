package LearnJava11;

import java.io.*;

public class BufferedStreamDemo01 {
    public static void main(String[] args) throws IOException {
//        FileWriter fw=new FileWriter("D:\\MyProject\\Java\\Demo1\\src\\LearnJava11\\bw.txt");
//        BufferedWriter bw=new BufferedWriter(fw);
        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\MyProject\\Java\\Demo1\\src\\LearnJava11\\bw.txt"));
        bw.write("hello\r\n");
        bw.write("world\r\n");
        bw.close();

        BufferedReader br=new BufferedReader(new FileReader("D:\\MyProject\\Java\\Demo1\\src\\LearnJava11\\bw.txt"));

//        一次读取一个字符数据
//        int ch;
//        while((ch=br.read())!=-1){
//            System.out.print((char)ch);
//        }
        System.out.println("----------");
//        一次读取一个字符数组数据
        char []chs=new char[1024];
        int len;
        while ((len= br.read(chs))!=-1){
            System.out.print(new String(chs,0,len));
        }

        bw.close();
        br.close();
    }
}
