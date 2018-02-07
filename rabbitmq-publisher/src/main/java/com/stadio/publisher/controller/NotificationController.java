package com.stadio.publisher.controller;

import com.stadio.publisher.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("notification")
public class NotificationController
{

    @Autowired Producer producer;

    @GetMapping(value = "push")
    public ResponseEntity pushToRabbit(@RequestParam(value = "content", defaultValue = "Default value") String content)
    {
        SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        producer.send(content + ":" + fm.format(new Date()));
        return ResponseEntity.ok("OK");
    }
}
