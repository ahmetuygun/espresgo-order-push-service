package coffee.order.synch;

import com.github.fabiomaffioletti.firebase.EnableFirebaseRepositories;
import com.google.protobuf.GeneratedMessageV3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@EnableFirebaseRepositories
@SpringBootApplication
public class OrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}


}
