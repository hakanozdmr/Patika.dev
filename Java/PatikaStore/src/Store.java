import java.util.*;
class Store {
    private List<Brand> brands;
    private List<Product> products;

    public Store() {
        brands = new ArrayList<>();
        products = new ArrayList<>();
        initializeBrands();
    }

    private void initializeBrands() {
        // Markaların statik olarak eklenmesi
        String[] brandNames = {"Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Xiaomi", "Monster"};
        for (int i = 0; i < brandNames.length; i++) {
            Brand brand = new Brand(i + 1, brandNames[i]);
            brands.add(brand);
        }
        // Markaların alfabe sırasına göre sıralanması
        Collections.sort(brands, Comparator.comparing(Brand::getName));
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(int productId) {
        products.removeIf(product -> product.getId() == productId);
    }

    public List<Product> filterProductsByBrand(int brandId) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getBrand().getId() == brandId) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public List<Brand> getAllBrands() {
        return brands;
    }
}
