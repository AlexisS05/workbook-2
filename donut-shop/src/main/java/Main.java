public class Main {
    public static void main(String[] args) {

        Donut myDonuts[] = new Donut[6];
        myDonuts[0] = new Donut("Cream", 150, 2.00f, "This is a creamy donut!");
        myDonuts[1] = new Donut("Jelly", 250, 2.50f, "This is a jelly donut!");
        myDonuts[2] = new Donut("Chocolate", 250, 2.50f, "This is a chocolate flavored donut!");
        myDonuts[3] = new Donut("Gluten-Free", 100, 2.00f, "This is a gluten-free donut!");
        myDonuts[4] = new Donut("Cinnamon", 220, 2.50f, "This is a cinnamon donut!");
        myDonuts[5] = new Donut("Sprinkled", 300, 3.00f, "This is a sprinkled donut!");

        float totalPrice = 0;
        for (Donut donut : myDonuts
        ) {
            System.out.println(donut);
            totalPrice += donut.getPrice();
        }
        System.out.printf("This is the total price: $%.2f%n", totalPrice);
    }
}

