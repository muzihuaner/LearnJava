package LearnJava12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToTxtDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<String> array=new ArrayList<String>();

        array.add("Hello");
        array.add("World");
        array.add("Java");

        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\MyProject\\Java\\Demo1\\src\\LearnJava12\\array.txt"));

        for (String s:array){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
