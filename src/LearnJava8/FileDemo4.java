package LearnJava8;

import java.io.File;

public class FileDemo4 {
    public static void main(String[] args) {
        File f=new File("D:\\MyProject\\Java\\Demo1\\src\\LearnJava8\\Java.txt");

        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.exists());

        System.out.println("------------");
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getPath());
        System.out.println(f.getName());

        System.out.println("-------------");
        File f2=new File("D:\\MyProject\\Java\\Demo1\\src\\LearnJava8\\");
        String[] StrArray = f2.list();
        for (String s:StrArray){
            System.out.println(s);
        }
        System.out.println("-------------");
        File[] fileArray = f2.listFiles();
        for (File file:fileArray){
//            System.out.println(file);
//            System.out.println(file.getName());

//            如果是文件，就得到文件名
            if(file.isFile()){
                System.out.println(file.getName());
            }
        }
    }
}
