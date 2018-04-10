package com.emergency.rescue.websocket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

/**
 * Created by xionghy on 2018/4/10.
 */

@ServerEndpoint("/websocket")
@Slf4j
@Component
public class TestWebSocket {


    @OnOpen
    public void onOpen( Session session){
        log.info("新连接,");
    }

    @OnClose
    public void onColse(){
        log.info("连接关闭。");
    }

    @OnMessage
    public void onMessage(String message, Session session) throws  Exception{
        log.info("接收消息:{}",message);
        for (int i = 0; i < 100; i++) {
            Thread.sleep(1000);
            session.getBasicRemote().sendText("服务器发送消息"+i);
        }
    }

    @OnError
    public void onError( Session session, Throwable throwable){
        log.error("连接出现异常：{}",throwable);
    }
}
