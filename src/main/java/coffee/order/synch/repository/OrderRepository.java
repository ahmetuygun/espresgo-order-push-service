package coffee.order.synch.repository;

import coffee.order.synch.model.OrderFireBaseObject;
import com.github.fabiomaffioletti.firebase.repository.DefaultFirebaseRealtimeDatabaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository extends DefaultFirebaseRealtimeDatabaseRepository<OrderFireBaseObject, String> {
}
