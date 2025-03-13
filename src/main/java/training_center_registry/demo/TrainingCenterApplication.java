package training_center_registry.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("training_center_registry.demo.model")
public class TrainingCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(TrainingCenterApplication.class, args);
    }
}