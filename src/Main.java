public class Main {
    public static void main(String[] args) {

    }
    public static String greet(String name, String owner) {
        if (name.equals(owner)) {
            return name;
        }
        return "Hello guest";
    }
}