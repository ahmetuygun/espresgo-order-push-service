package coffee.order.synch.model;

import com.github.fabiomaffioletti.firebase.document.FirebaseDocument;
import com.github.fabiomaffioletti.firebase.document.FirebaseId;

import static coffee.order.synch.util.Constants.BASE_PATH;

@FirebaseDocument(BASE_PATH + "/order")

public class Order {

    @FirebaseId
    private Long id;
    private Long orderUid;
    private Integer status;

}
