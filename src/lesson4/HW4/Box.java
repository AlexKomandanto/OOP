package lesson4.HW4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box<T extends Fruit> implements Iterable<T> {

    private final List<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void add(T fruit) {
        // добавляем фрукт в коробку
        fruits.add(fruit);
    }

    public int getWeight() {
        // TODO: 13.03.2023 Сумма весов всех фруктов
        double totalWeight = 0.0;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return (int) totalWeight;
    }

    public void moveTo(Box<? super T> target) {
        // пересыпаем фрукты отсюда в target
        if (target == this) {
            return;
        }
        for (T fruit : fruits) {
            target.add(fruit);
        }
        fruits.clear();
    }
    @Override
    public Iterator<T> iterator() {
        return fruits.iterator();
    }


}
