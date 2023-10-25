import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentProcessorService4 {

    @PostMapping("/service4")
    public ServiceResponse processPayment(@RequestBody CardRequest cardRequest) {
       
        ServiceResponse response = new ServiceResponse();
        response.setStatus("SUCCESS");
        response.setTimestamp("2200-12-20T23:55:57Z"); 

       
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return response;
    }
}
