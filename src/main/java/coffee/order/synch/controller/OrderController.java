package coffee.order.synch.controller;


import coffee.order.synch.model.OrderRequest;
import coffee.order.synch.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OrderController {

    @Autowired
    OrderService orderServis;

    @PostMapping("/pushOrder")
    public ResponseEntity<?> pushOrder(@RequestBody OrderRequest orderRequest) {

        orderServis.pushOrder(orderRequest);

        return ResponseEntity.ok("Success");

    }

}
