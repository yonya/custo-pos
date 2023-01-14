package cl.custo.service;

import cl.custo.model.Order;
import cl.custo.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@AllArgsConstructor
@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public List<Order> findAll() {
        return (List<Order>) orderRepository.findAll();
    }

    public Order findById(String orderId) {
        return orderRepository.findById(orderId).orElseThrow(() -> new NoSuchElementException());
    }

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    public void deleteOrder(String orderId) {
        orderRepository.deleteById(orderId);
    }

    public Order updateOrder(Order order) {
        return orderRepository.save(order);
    }

    public boolean existById(String orderId) {
        return orderRepository.existsById(orderId);
    }

}
