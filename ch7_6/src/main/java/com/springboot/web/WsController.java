package com.springboot.web;

import com.springboot.domain.WsMessage;
import com.springboot.domain.WsResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * @Author: withlzc
 * @Description:
 * @Date: Created in 2018/12/7 0007 16:55
 */

@Controller
public class WsController {

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public WsResponse say(WsMessage message) throws Exception {
        Thread.sleep(3000);
        return new WsResponse("Welcome, " + message.getName() + "!");
    }


}
