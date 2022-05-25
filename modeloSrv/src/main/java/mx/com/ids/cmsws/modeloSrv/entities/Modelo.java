package mx.com.ids.cmsws.modeloSrv.entities;

public class Modelo {
	private int id;
	private int tipo;
	private String modelo;
	private String descripcion;
	
	public Modelo(int id, int tipo, String modelo, String descripcion) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.modelo = modelo;
		this.descripcion = descripcion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
