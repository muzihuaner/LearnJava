package learnjava3;

public class HashDemo {
    public static void main(String[] args) {
        Student s1=new Student("小白",23);
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
    }
}
