package LearnJava11;

import java.io.*;

public class BufferedStreamDemo02 {
    public static void main(String[] args) throws IOException {
//        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\MyProject\\Java\\Demo1\\src\\LearnJava11\\bw2.txt"));
//        for (int i = 0; i < 10; i++) {
//            bw.write("hello"+i);
//            bw.newLine();
//            bw.flush();
//        }
//        bw.close();
        BufferedReader br=new BufferedReader(new FileReader("D:\\MyProject\\Java\\Demo1\\src\\LearnJava11\\bw2.txt"));
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        };
        br.close();
    }
}
