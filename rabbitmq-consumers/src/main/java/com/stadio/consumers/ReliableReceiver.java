package com.stadio.consumers;


import org.springframework.stereotype.Component;

@Component
public class ReliableReceiver implements Receiver
{

    @Override
    public void receiveMessage(String message) throws Exception
    {
        System.out.println(message);
    }
}
