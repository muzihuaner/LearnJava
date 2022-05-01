package LearnJava9;

import java.io.File;

public class DiGuiDemo3 {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\Administrator\\Downloads\\");
//        调用方法
        getAllFilePath(f);
    }
    public static void getAllFilePath(File srcFile){
//        获取给定目录下所有文件和目录
        File[] filesArray = srcFile.listFiles();
        if (filesArray!=null){
            for (File file:filesArray){
//                判断是否为目录
                if (file.isDirectory()){
                    getAllFilePath(file);
                }else {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
