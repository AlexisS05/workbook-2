public class Donut {
    String type;
    int calories;
    float price;
    String description;

    public Donut(String type, int calories, float price, String description) {
        this.type = type;
        this.calories = calories;
        this.price = price;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Donut{" +
                "type='" + type + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
