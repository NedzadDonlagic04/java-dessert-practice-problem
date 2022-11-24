public class Main {
    public static void main(String[] args) {
        Dessert dessert = new Dessert("Apple Pie", 1.0, 2000);
        Cake cake = new Cake("Fruitcake", 0.2, 1000, true, "regular");
        IceCream iceCream = new IceCream("Banana Boat", 0.5, 1500, "Chocolate, Banana, Vanilla", "yellowish brown");
        // ^ Making the instances of the classes to test the results

        System.out.println(dessert.toString());
        System.out.println(dessert.getDessertType());
        // ^ Testing the dessert class in practice

        System.out.println(cake.toString());
        System.out.println(cake.getDessertType());
        // ^ Testing the cake class in practice

        System.out.println(iceCream.toString());
        System.out.println(iceCream.getDessertType());
        // ^ Testing the ice cream class in practice
    }
}