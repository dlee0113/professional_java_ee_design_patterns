package com.devchronicles.websockets;

import java.io.IOException;

import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/hello")
public class HelloEndpoint2 {
	@OnMessage
	public void onMessage(Session session, String msg) {
		try {
			session.getBasicRemote().sendText("Hello " + msg);
		} catch (IOException e) {
		}
	}
}