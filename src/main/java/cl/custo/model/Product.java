package cl.custo.model;

public class Product {

    private String productId;
    private String description;
    private String price;
    private String lastUpdated;

    public Product() {
    }

    public Product(String productId, String description, String price, String lastUpdated) {
        this.productId = productId;
        this.description = description;
        this.price = price;
        this.lastUpdated = lastUpdated;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", lastUpdated='" + lastUpdated + '\'' +
                '}';
    }
}
