package mx.com.ids.cmsws.activoSrv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
//@EnableCircuitBreaker
public class ActivoSrvApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActivoSrvApplication.class, args);
	}
	
	@Configuration
	class RestTemplateConfig {
		//Bean restTemplate para invocar servicios rest
		@Bean
		@LoadBalanced //Balanceo de carga del lado del cliente
		public RestTemplate restTemplate() {
			return new RestTemplate();
		}
	}

}
