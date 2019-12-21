package com.ldingyi.cloudaddress.socket;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ldingyi.cloudaddress.entity.Chat;

import org.springframework.stereotype.Component;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@ServerEndpoint("/socket/chat/{phone}")
@Component
public class SocketService {
   /* @Autowired
    ChatService chatService;*/

    private static int onlineCount = 0;
    private static Map<String , Session> map = new HashMap<>();
    private String phone;

    @OnOpen
    public void connect(Session session, @PathParam("phone") String phone){
        this.phone=phone;
        map.put(phone,session);
        System.out.println(phone+"练了上来");
        addOnlineCount();


    }

    @OnMessage
    public void echoMessage(String chatJSON){
        System.out.println(chatJSON);

        try {
            ObjectMapper objectMapper = new ObjectMapper();

            Chat chat = objectMapper.readValue(chatJSON,Chat.class);
            /*chatService.send(chat);*/

            for (String phone : map.keySet()) {
                if (phone.equals(chat.getReceiver())){

                    map.get(phone).getBasicRemote().sendText(chat.getMessage());

                }
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e){
                e.printStackTrace();
        }




    }

    @OnClose
    public void close(){
        map.remove(phone);
        subOnlineCount();
    }






    public static synchronized int getOnlineCount() {
        return onlineCount;
    }

    public static synchronized void addOnlineCount() {
        SocketService.onlineCount++;
    }

    public static synchronized void subOnlineCount() {
        SocketService.onlineCount--;
    }
}
