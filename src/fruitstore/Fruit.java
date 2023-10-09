package fruitstore;

public class Fruit {
    private String name;
    private Color color;
    private int price;

    public Fruit(Color color, String fruitName, int price) {
        this.name = fruitName;
        this.color = color;
        this.price = price;
    }

    public String getName() {
       return this.name;
    }

    public Color getColor() {
        return this.color;
    }

    public int getPrice(){
        if (this.price < 0) {
            throw new IllegalArgumentException("The price value must be higher than 0.");
        }
        return this.price;
    }

    @Override
    public String toString() {
        return "Fruit: " + this.color +" " + this.name;
    }
}
