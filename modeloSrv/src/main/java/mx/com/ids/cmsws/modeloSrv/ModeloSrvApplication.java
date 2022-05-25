package mx.com.ids.cmsws.modeloSrv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ModeloSrvApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModeloSrvApplication.class, args);
	}

}
