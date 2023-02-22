package com.cpan228.Assignment1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cpan228.Assignment1.controller.HomeController;

@SpringBootApplication
public class Assignment1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Assignment1Application.class, args);
		HomeController controller = context.getBean(HomeController.class);
	}

}
