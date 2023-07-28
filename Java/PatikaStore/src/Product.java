class Product {
    private int id;
    private double unitPrice;
    private double discountRate;
    private int stockQuantity;
    private String name;
    private Brand brand;

    public Product(int id, double unitPrice, double discountRate, int stockQuantity, String name, Brand brand) {
        this.id = id;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.stockQuantity = stockQuantity;
        this.name = name;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public String getName() {
        return name;
    }

    public Brand getBrand() {
        return brand;
    }
}