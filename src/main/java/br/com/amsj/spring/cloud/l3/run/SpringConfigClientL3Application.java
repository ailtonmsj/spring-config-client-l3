package br.com.amsj.spring.cloud.l3.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"br.com.amsj.spring.cloud.l3.controller"})
public class SpringConfigClientL3Application {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringConfigClientL3Application.class, args);
	}
}
