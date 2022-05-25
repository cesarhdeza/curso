package mx.com.ids.cmsws.activoSrv.entities;

import java.util.List;

public class Activo {
	private int id;
	private List<Object> modelos;
	
	public Activo() {}
	public Activo(int id, List<Object> modelos) {
		super();
		this.id = id;
		this.modelos = modelos;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Object> getModelos() {
		return modelos;
	}
	public void setModelos(List<Object> modelos) {
		this.modelos = modelos;
	}
	
	
}
