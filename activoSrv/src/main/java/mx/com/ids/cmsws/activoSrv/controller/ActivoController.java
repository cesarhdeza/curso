package mx.com.ids.cmsws.activoSrv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import mx.com.ids.cmsws.activoSrv.entities.Activo;

@RestController
@RequestMapping("/")
public class ActivoController {
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private Environment env;
	
	@RequestMapping("/")
	public String home() {
		//Este endpoind ActivoSrv en para identificar el puerdo de la instancia que corresponde
		return "Hola desde ActivoSrv en el puerto: " + env.getProperty("local.server.port");
	}
	
	//@HystrixCommand(fallbackMethod="fallback")
	
	@RequestMapping("/{id}")
	public Activo getActivo(@PathVariable final int id) {
		//creacion de objeto activo
		Activo activo = new Activo();
		activo.setId(id);
		
		//lista de todos los modelos
		@SuppressWarnings("unchecked")
		List<Object> modelos = restTemplate.getForObject("http://modelo-service/modelos/", List.class);
		activo.setModelos(modelos);
		return activo;
	}
	
	//------Admin--------
	//Aqui se configura un area segura para el servicio
	@RequestMapping("/admin")
	public String homeAdmin() {
		return "Area de admin en el puerto: " + env.getProperty("http:local.server.port");
	}

	public Activo fallback(int id, Throwable  hystrixCo) {
		return new Activo();
	}
}
