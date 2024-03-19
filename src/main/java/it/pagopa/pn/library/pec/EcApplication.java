package it.pagopa.pn.library.pec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(scanBasePackages = {"it.pagopa.pn.ec", "it.pagopa.pn.library.pec"})
@ConfigurationPropertiesScan(basePackages = {"it.pagopa.pn.ec", "it.pagopa.pn.library.pec"})

// SQS QUEUE
@PropertySource("classpath:pec/pec-sqs-queue.properties")
// LAVORAZIONE
@PropertySource("classpath:pec/lavorazione-pec.properties")

public class EcApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcApplication.class, args);
    }
}
