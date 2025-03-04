package com.pedro.store;

import com.pedro.store.managers.NotificationManager;
import com.pedro.store.services.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		var manager = context.getBean(NotificationManager.class);
		manager.sendNotification("This is a test");
	}

}
