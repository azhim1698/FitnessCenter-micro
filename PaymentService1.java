@Service
public class PaymentService1 {
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public PaymentService1(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void processPayment(CreditCardInfo creditCardInfo) {
       
        String message = "PAYMENT_PROCESSING";
        kafkaTemplate.send("payment_topic", message);
    }
}
