package com.ephonetech.spring.kafka.stream.c.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 自定义版生产者1号
 * 
 * @author Weihai Li
 *
 */
@SpringBootApplication
@EnableScheduling
public class TestProducerApplication3 {

	public static void main(String[] args) throws Exception {
		String[] args2 = new String[] { "--server.port=8893", "--spring.profiles.active=tout3", "--task=3" };
		SpringApplication.run(TestProducerApplication3.class, args2);
	}

}
