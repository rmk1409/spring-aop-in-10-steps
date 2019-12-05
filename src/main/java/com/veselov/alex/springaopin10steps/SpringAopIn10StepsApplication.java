package com.veselov.alex.springaopin10steps;

import com.veselov.alex.springaopin10steps.business.Business1;
import com.veselov.alex.springaopin10steps.business.Business2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopIn10StepsApplication implements CommandLineRunner {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringAopIn10StepsApplication.class);

    @Autowired
    private Business1 business1;
    @Autowired
    private Business2 business2;


    public static void main(String[] args) {
        SpringApplication.run(SpringAopIn10StepsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    	LOGGER.info("bus1 - {}", business1.calculateBusinessLogic());
    	LOGGER.info("bus2 - {}", business2.calculateBusinessLogic());
    }
}
