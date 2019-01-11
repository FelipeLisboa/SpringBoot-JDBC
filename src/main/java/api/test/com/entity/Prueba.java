package api.test.com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Prueba")
public class Prueba {

	@Id
	@Column(name="id")
	Integer id;
	
	@Column(name="nombre")
	String nombre;

	public Prueba(Integer id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public Prueba() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
