package com.emergency.rescue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xionghy on 2018/4/10.
 */
@Controller
public class WebSocketController {

    @RequestMapping(value = "/webIndex")
    public  String webIndex(){
        return  "webIndex";
    }
}
