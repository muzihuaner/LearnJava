package Day9;

public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperator ao=new AnimalOperator();
        Animal c=new Cat();
        ao.useAnimal(c);
        Animal d=new Dog();
        ao.useAnimal(d);
    }
}
