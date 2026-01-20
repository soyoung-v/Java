package ch07.sec08;

public class AnimalMain4 {
    public static void main(String[] args){
        Dog dog = new Dog();
        Bulldog bulldog = new Bulldog();
        Cat cat = new Cat();

        haha();

        doCrying(dog);
        doCrying(cat);
    }

    public  static void  haha(){
        System.out.println("하하");
    }
    public static void doCrying(Animal animal){
        animal.crying();
    }
}
