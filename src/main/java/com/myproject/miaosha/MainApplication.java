package com.myproject.miaosha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.myproject.miaosha.controller.SampleController;


@SpringBootApplication
public class MainApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(MainApplication.class, args);
	}
}
