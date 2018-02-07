package com.stadio.consumers;


public interface Receiver
{
    void receiveMessage(String message) throws Exception;
}
