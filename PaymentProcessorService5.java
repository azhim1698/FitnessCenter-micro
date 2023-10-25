import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentProcessorService4 {

    @PostMapping("/service5")
    public ServiceResponse processPayment(@RequestBody CardNameRequest cardNameRequest) {
        
        ServiceResponse response = new ServiceResponse();
        response.setStatus("SUCCESS");
        response.setTimestamp("2200-12-20T23:55:57Z"); // Atur timestamp sesuai kebutuhan

        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return response;
    }
}
