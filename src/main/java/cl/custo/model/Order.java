package cl.custo.model;

import cl.custo.constants.OrderStatus;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;
    private String orderId;

    private OrderStatus status;

    public Order(UUID uuid, String orderId, OrderStatus status) {
        this.uuid = uuid;
        this.orderId = orderId;
        this.status = status;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "uuid=" + uuid +
                ", orderId='" + orderId + '\'' +
                ", status=" + status +
                '}';
    }
}
