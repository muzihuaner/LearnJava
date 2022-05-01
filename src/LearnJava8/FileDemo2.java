package LearnJava8;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        File f1=new File("D:\\MyProject\\Java\\Demo1\\src\\LearnJava8\\Java.txt");
        System.out.println(f1.createNewFile());
        System.out.println("----------");
        File f2=new File("D:\\MyProject\\Java\\Demo1\\src\\LearnJava8\\Hello\\");
        System.out.println(f2.mkdir());
        System.out.println("----------");
        File f3=new File("D:\\MyProject\\Java\\Demo1\\src\\LearnJava8\\Hello\\World\\");
        System.out.println(f3.mkdirs());
        System.out.println("---------");
        File f4=new File("D:\\MyProject\\Java\\Demo1\\src\\LearnJava8\\Javase.txt");
        System.out.println(f4.mkdir());
    }
}
