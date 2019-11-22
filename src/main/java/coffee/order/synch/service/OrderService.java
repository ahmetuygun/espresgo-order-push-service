package coffee.order.synch.service;

import coffee.order.synch.model.OrderRequest;
import coffee.order.synch.model.OrderFireBaseObject;
import coffee.order.synch.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Import(OrderService.RepositoryTestConfiguration.class)
public class OrderService {


    @Configuration
    public static class RepositoryTestConfiguration {

        @Bean
        public RestTemplate restTemplate() {
            return new RestTemplate();
        }

        @Bean
        public OrderRepository authorRepository() {
            return new OrderRepository();
        }

    }


    @Autowired
    private OrderRepository orderRepository;


    public boolean pushOrder( OrderRequest orderRequest){

        orderRepository.push(OrderFireBaseObject.builder()
                .orderUid(orderRequest.getOrderUid())
                .addessText(orderRequest.getAddessText())
                .orderDate(orderRequest.getOrderDate())
                .orderItemNames(orderRequest.getOrderItemNames())
                .status(orderRequest.getStatus()).build());

        return true;
    }


}
