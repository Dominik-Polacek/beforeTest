package fruitstore;

import java.util.ArrayList;
import java.util.List;

public class FruitStore {
    Fruit price;
    Color color;
    List<Fruit> fruitList = new ArrayList<>();

    public List<Fruit> getFruits() {
        return fruitList;
    }

    public void addFruit(Fruit fruit) {
        fruitList.add(fruit);
    }

    public List<Fruit> getFruits(String colorName) {
        //vytvoříme si List<Fruit>
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit : fruitList) {
            if (fruit.getColor().getName().equalsIgnoreCase(colorName)) {
                result.add(fruit);
            }
        }
        return result;
    }

    public List<Fruit> getFruits(Color color) {
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit : fruitList) {
            if (fruit.getColor().equals(color)) {
                result.add(fruit);
            }
        }
        return result;
    }

    public int buyFruits(List<Fruit> fruits) {
        int price = 0;
        List<Fruit> removeFruit = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if(fruitList.contains(fruit)){
                price += fruit.getPrice();
                removeFruit.add(fruit);
            }

        }
        fruitList.removeAll(removeFruit);
        return price;
    }
}

