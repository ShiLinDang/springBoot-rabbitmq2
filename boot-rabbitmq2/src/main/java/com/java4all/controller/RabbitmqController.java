package com.java4all.controller;

import com.java4all.component.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "send")
public class RabbitmqController {
    @Autowired
    private Sender sender;

    @RequestMapping(value = "sendMsg",method = RequestMethod.GET)
    public String sendMsg(String message){
        sender.send(message);
        return "Send.............";
    }
}
