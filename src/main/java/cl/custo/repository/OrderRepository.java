package cl.custo.repository;

import cl.custo.model.Order;
import org.springframework.data.repository.CrudRepository;


public interface OrderRepository extends CrudRepository<Order, String> {
}
