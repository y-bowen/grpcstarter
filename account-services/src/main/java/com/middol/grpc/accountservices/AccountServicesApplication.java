package com.middol.grpc.accountservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class AccountServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountServicesApplication.class, args);
	}

}
