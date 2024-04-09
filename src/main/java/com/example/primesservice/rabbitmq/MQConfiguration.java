package com.example.primesservice.rabbitmq;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
@Configuration
public class MQConfiguration {

    @Bean
    public Queue queue() {
        return new Queue("primes");
    }
}
