@Service
public class PaymentProcessorService2 {
    private KafkaListenerEndpointRegistry registry;
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public PaymentProcessorService2(
        KafkaListenerEndpointRegistry registry, KafkaTemplate<String, String> kafkaTemplate) {
        this.registry = registry;
        this.kafkaTemplate = kafkaTemplate;
    }

    @KafkaListener(id = "payment_processor_2", topics = "payment_topic", containerFactory = "kafkaListenerContainerFactory")
    public void processPayment(String message) {
       
        kafkaTemplate.send("service_3_topic", "Service 3 message");
        kafkaTemplate.send("service_4_topic", "Service 4 message");
        kafkaTemplate.send("service_5_topic", "Service 5 message");
       
        kafkaTemplate.send("frontend_notification_topic", "Payment processing started at: " + timestamp);
    }

    public void startProcessing() {
        registry.getListenerContainer("payment_processor_2").start();
    }

    public void stopProcessing() {
        registry.getListenerContainer("payment_processor_2").stop();
    }
}
