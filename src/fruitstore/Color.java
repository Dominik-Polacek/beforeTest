package fruitstore;

import org.w3c.dom.css.RGBColor;

public class Color {
    private String name;
    private int red;
    private int green;
    private int blue;

    public  Color (int red, int green, int blue,String name){
    this.name = name;
    }
    public String getName () {
       return this.name = name;
    }

    public void getRed(int red) {
        this.red = red;
    }
    public void setRed(int red) {
        if (red < 0 || red > 255) {
            throw new IllegalArgumentException("Red value must be between 0 and 255.");
        }
        this.red = red;
    }

    public void getGreen(int green) {
        this.green = green;
    }
    public void setGreen(int green) {
        if (green < 0 || green > 255) {
            throw new IllegalArgumentException("Green value must be between 0 and 255.");
        }
        this.green = green;
    }

    public void getBlue(int blue) {
        this.blue = blue;
    }
    public void setBlue(int blue) {
        if (blue < 0 || blue > 255) {
            throw new IllegalArgumentException("Blue value must be between 0 and 255.");
        }
        this.blue = blue;
    }

    @Override
    public String toString() {
        return name;
    }
}
