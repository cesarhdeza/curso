package mx.com.ids.cmsws.modeloSrv.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.ids.cmsws.modeloSrv.entities.Modelo;

@RestController
@RequestMapping("/")
public class ModeloController {
	
	@GetMapping("/modelos")
	public List<Modelo> getModelos(){
		List<Modelo> modelos = Arrays.asList(
				new Modelo(1, 1, "Dell Latitude E5440", "8gb 512gb"),
				new Modelo(2, 1, "Dell Inspiron E3480", "8gb 512gb"),
				new Modelo(3, 2, "Apple Macbook Pro 13", "8gb ssd 256gm")
				);
		return modelos;
	}

}
