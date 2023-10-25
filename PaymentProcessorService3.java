import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentProcessorService3 {

    @PostMapping("/service3")
    public ServiceResponse processPayment(@RequestBody PaymentRequest paymentRequest) {
        
        ServiceResponse response = new ServiceResponse();
        response.setStatus("SUCCESS");
        response.setTimestamp("2200-12-20T23:55:57Z"); // Atur timestamp sesuai kebutuhan

        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return response;
    }
}
