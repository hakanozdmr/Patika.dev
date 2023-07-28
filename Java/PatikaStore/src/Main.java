import java.util.*;
public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        Brand samsung = store.getAllBrands().get(0);
        Brand lenovo = store.getAllBrands().get(1);

        Product phone1 = new Product(1, 2500, 0.15, 50, "Galaxy A51", samsung);
        Product phone2 = new Product(2, 3500, 0.1, 30, "iPhone 11", samsung);
        Product notebook1 = new Product(3, 5000, 0.2, 20, "ThinkPad X1", lenovo);

        store.addProduct(phone1);
        store.addProduct(phone2);
        store.addProduct(notebook1);

        System.out.println("Tüm Ürünler:");
        listProducts(store.getAllProducts());

        System.out.println("\nSamsung Markalı Ürünler:");
        List<Product> samsungProducts = store.filterProductsByBrand(samsung.getId());
        listProducts(samsungProducts);

        System.out.println("\nCep Telefonları:");
        List<Product> phones = filterProductsByCategory(store.getAllProducts(), "Cep Telefonu");
        listProducts(phones);
    }

    public static void listProducts(List<Product> products) {
        System.out.format("%-5s | %-20s | %-10s | %-10s | %-20s | %-10s\n", "ID", "Ürün Adı", "Marka", "Fiyat", "İndirim", "Stok");
        System.out.println("------------------------------------------------------------------------");
        for (Product product : products) {
            System.out.format("%-5d | %-20s | %-10s | %-10.2f | %-20.2f | %-10d\n", product.getId(), product.getName(),
                    product.getBrand().getName(), product.getUnitPrice(), product.getUnitPrice() * product.getDiscountRate(),
                    product.getStockQuantity());
        }
    }

    public static List<Product> filterProductsByCategory(List<Product> products, String category) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(category.toLowerCase())) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }
}