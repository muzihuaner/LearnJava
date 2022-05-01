package LearnJava8;

import java.io.File;

public class FileDemo5 {
    public static void main(String[] args) {
        File f=new File("D:\\MyProject\\Java\\Demo1\\src\\LearnJava8\\Java.txt");
        System.out.println(f);
        System.out.println(f.delete());

        File f2=new File("D:\\MyProject\\Java\\Demo1\\src\\LearnJava8\\Javase\\");
        System.out.println(f2.mkdir());
        System.out.println(f2.delete());
    }
}
