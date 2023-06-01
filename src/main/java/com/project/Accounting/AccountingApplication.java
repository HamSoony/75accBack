package com.project.Accounting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class AccountingApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountingApplication.class, args);
	}

}
