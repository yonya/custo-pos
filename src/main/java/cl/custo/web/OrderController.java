package cl.custo.web;

import cl.custo.model.Order;
import cl.custo.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")

public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping()
    public ResponseEntity<List<Order>> getAllOrders() {
        return new ResponseEntity<>(orderService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable("orderId") String orderId) {
        return new ResponseEntity<>(orderService.findById(orderId), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        return new ResponseEntity<>(orderService.saveOrder(order), HttpStatus.CREATED);
    }

    @PutMapping("/{orderId}")
    public ResponseEntity<Order> updateOrder(@PathVariable("orderId") String orderId, @RequestBody Order order) {
        if (orderService.existById(orderId)) {
            return new ResponseEntity<>(orderService.saveOrder(order), HttpStatus.ACCEPTED);
        }
        throw new IllegalArgumentException("Order with id " + orderId + "not found");
    }

    @DeleteMapping("/{orderId}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable("orderId") String orderId) {
        orderService.deleteOrder(orderId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
