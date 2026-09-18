public class PairTest {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Age", 25);
        System.out.println(pair1.getKey() + ": " + pair1.getValue());

        Product product = new Product("P01", "Laptop", "Electronics", 29999.0, 10);
        Pair<Product, Boolean> pair2 = new Pair<>(product, true);
        System.out.println(pair2.getKey() + " | Active: " + pair2.getValue());
    }
}
