package coffee.order.synch.repository;

import coffee.order.synch.model.Order;
import com.github.fabiomaffioletti.firebase.repository.DefaultFirebaseRealtimeDatabaseRepository;

public class OrderRepository extends DefaultFirebaseRealtimeDatabaseRepository<Order, Long> {
}
