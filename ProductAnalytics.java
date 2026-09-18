import java.util.List;
import java.util.stream.Collectors;

public class ProductAnalytics {
    private List<Product> productCatalog;

    public ProductAnalytics(List<Product> productCatalog) {
        this.productCatalog = productCatalog;
    }

    public List<Product> findProductsByCategory(String category) {
        return productCatalog.stream()
                .filter(p -> p.category().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    public List<String> getProductNamesWithPriceLessThan(double maxPrice) {
        return productCatalog.stream()
                .filter(p -> p.price() < maxPrice)
                .map(Product::name)
                .collect(Collectors.toList());
    }

    public double calculateTotalStockValueForCategory(String category) {
        return productCatalog.stream()
                .filter(p -> p.category().equalsIgnoreCase(category))
                .mapToDouble(p -> p.price() * p.stock())
                .sum();
    }

    public boolean hasProductOutOfStock() {
        return productCatalog.stream()
                .anyMatch(p -> p.stock() == 0);
    }
}
