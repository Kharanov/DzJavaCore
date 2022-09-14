package DZ3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Box<T extends Fruit> {
    ArrayList<T> fruit = new ArrayList<T>();


    public void addFruit(T fruit) {
        this.fruit.add(fruit);
    }


    public double getWeight() {
        double totalWeight = 0;
        for (int i = 0; i < fruit.size(); i++) {
            totalWeight += fruit.get(i).getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box box2) {
        return this.getWeight() == box2.getWeight();
    }
    public void sprinkleFruit(Box<T> box) {
        for (int i = 0; i < fruit.size(); i++) {
            box.addFruit(fruit.get(i));

        }
        fruit.clear();
    }
}

