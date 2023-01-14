package cl.custo.model;

import cl.custo.constants.OrderStatus;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.UUID;

public class KOT extends Order {
    public Product[] products;
    public OrderStatus kotStatus;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;

    public KOT(UUID uuid, String orderId, OrderStatus status, UUID uuid1, Product[] products, OrderStatus kotStatus) {
        super(uuid, orderId, status);
        this.uuid = uuid1;
        this.products = products;
        this.kotStatus = kotStatus;
    }

    @Override
    public UUID getUuid() {
        return uuid;
    }

    @Override
    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public OrderStatus getKotStatus() {
        return kotStatus;
    }

    public void setKotStatus(OrderStatus kotStatus) {
        this.kotStatus = kotStatus;
    }

    @Override
    public String toString() {
        return "KOT{" +
                "uuid=" + uuid +
                ", products=" + Arrays.toString(products) +
                ", kotStatus=" + kotStatus +
                '}';
    }
}
