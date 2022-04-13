package day0;

//学生类
public class Student {
    String name;
    private int age;
//    提供set/get方法
    public void setAge(int a) {
        if (a<0||a>120){
            System.out.println("你给的年龄有误");
        }else {
            age=a;
        }
    }
    public int getAge(){
        return age;
    }

    public void study() {
        System.out.println("好好学习");
    }

    public void gohomework() {
        System.out.println("做作业");
    }

    public void show() {
        System.out.println(name+','+age);
    }
}
