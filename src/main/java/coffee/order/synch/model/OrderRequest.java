package coffee.order.synch.model;


import com.google.auto.value.AutoValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderRequest {

    private String orderUid;
    private String status;
    private String orderDate;
    private String orderItemNames;
    private String addessText;

}
