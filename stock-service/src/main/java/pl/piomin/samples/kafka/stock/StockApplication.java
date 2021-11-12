package pl.piomin.samples.kafka.stock;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class StockApplication {


    public static void main(String[] args) {
        SpringApplication.run(StockApplication.class, args);
    }

}
