package coffee.order.synch.model;

import com.github.fabiomaffioletti.firebase.document.FirebaseDocument;
import com.github.fabiomaffioletti.firebase.document.FirebaseId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static coffee.order.synch.util.Constants.BASE_PATH;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FirebaseDocument(BASE_PATH + "/order")
public class OrderFireBaseObject {

    @FirebaseId
    private String id;
    private String orderUid;
    private String status;
    private String orderDate;
    private String orderItemNames;
    private String addessText;
    private String statusString;

}
