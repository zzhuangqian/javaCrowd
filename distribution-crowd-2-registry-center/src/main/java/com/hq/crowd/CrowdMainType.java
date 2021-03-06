package com.hq.crowd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CrowdMainType {
    public static void main(String[] args){
        SpringApplication.run(CrowdMainType.class,args);
    }
}
