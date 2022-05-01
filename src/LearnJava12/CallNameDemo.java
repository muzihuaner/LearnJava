package LearnJava12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class CallNameDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("D:\\MyProject\\Java\\Demo1\\src\\LearnJava12\\names.txt"));

        ArrayList<String> array=new ArrayList<String>();

        String line;
        while ((line= br.readLine())!=null){
            array.add(line);
        }
        br.close();

        Random r = new Random();
        int index = r.nextInt(array.size());

        String name = array.get(index);

        System.out.println("幸运者:"+name);

    }
}
