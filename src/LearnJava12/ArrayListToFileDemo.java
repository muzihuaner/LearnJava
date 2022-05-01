package LearnJava12;

import java.io.*;
import java.util.ArrayList;

public class ArrayListToFileDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> array = new ArrayList<Student>();

        Student s1 = new Student("001", "小A同学", 21, "SXJZ");
        Student s2 = new Student("002", "小B同学", 22, "SXJZ");
        Student s3 = new Student("003", "小C同学", 23, "SXJZ");

        array.add(s1);
        array.add(s2);
        array.add(s3);

        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\MyProject\\Java\\Demo1\\src\\LearnJava12\\students.txt"));

        for (Student s : array) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.getSid()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());

            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
