package DZ3;

public class Main {

    
    public static void main(String[] args) {
        Apple apple = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Box<Apple> box = new Box<Apple>();
        box.addFruit(apple);
        box.addFruit(apple2);
        box.addFruit(apple3);
        System.out.println(box.getWeight());
        Box<Orange> box2 = new Box<Orange>();

        Orange orange = new Orange();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        box2.addFruit(orange);
        box2.addFruit(orange1);
        box2.addFruit(orange2);
        box2.addFruit(orange3);

        System.out.println(box.compare(box2));




    }
}
