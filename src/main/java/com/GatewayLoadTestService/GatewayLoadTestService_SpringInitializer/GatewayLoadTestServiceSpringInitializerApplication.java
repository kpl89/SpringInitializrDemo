package com.GatewayLoadTestService.GatewayLoadTestService_SpringInitializer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.context.annotation.Bean;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;

@SpringBootApplication
@EnableAsync
@EnableSwagger2
public class GatewayLoadTestServiceSpringInitializerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayLoadTestServiceSpringInitializerApplication.class, args);
		System.out.println("Hello Kapil");
	}

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.GatewayLoadTestService.GatewayLoadTestService_SpringInitializer"))
				.build();
	}

}
