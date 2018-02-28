package com.demo.websocket.project.WebSocketProject;

import com.demo.websocket.project.controllers.DataController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class WebSocketProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebSocketProjectApplication.class, args);
	}
}
