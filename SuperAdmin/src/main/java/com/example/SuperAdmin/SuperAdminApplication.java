package com.example.SuperAdmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SuperAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(SuperAdminApplication.class, args);
        System.out.println("=========================USER PROFILE CREATED SUCCESSFULLY=====================================");

    }

}