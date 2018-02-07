package com.stadio.publisher;


import com.stadio.model.Constants;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PublisherApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(PublisherApplication.class);
    }

    @Bean
    TopicExchange exchange() {
        return new TopicExchange(Constants.EXCHANGE);
    }
}
