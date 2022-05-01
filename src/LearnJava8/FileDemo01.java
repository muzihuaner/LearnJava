package LearnJava8;

import java.io.File;

public class FileDemo01 {
    public static void main(String[] args) {
        File f1=new File("D:\\MyProject\\Java\\Demo1\\src\\LearnJava8\\Java.txt");
        System.out.println(f1);
        File f2=new File("D:\\MyProject\\Java\\Demo1\\src\\LearnJava8\\","Java.txt");
        System.out.println(f2);
        File f3=new File("D:\\MyProject\\Java\\Demo1\\src\\LearnJava8\\");
        File f4=new File(f3,"Java.txt");
        System.out.println(f3);
    }
}
