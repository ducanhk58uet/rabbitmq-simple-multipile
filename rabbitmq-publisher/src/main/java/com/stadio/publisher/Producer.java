package com.stadio.publisher;

import com.stadio.model.Constants;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer
{

    @Autowired RabbitTemplate rabbitTemplate;

    public void send(String message)
    {
        System.out.println("Sending message...");
        rabbitTemplate.convertAndSend(Constants.QUEUE_NAME, message);
    }
}
