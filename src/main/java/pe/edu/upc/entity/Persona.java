package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Persona")

public class Persona  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	
	@Column(name="Persona",nullable = false,length = 40)
	
	private String nombrePersona;
	
	private String correoPersona;
	
	private int telefonoPersona;
	
	private int calificacion;

	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persona(int id, String nombrePersona, String correoPersona, int telefonoPersona, int calificacion) {
		super();
		this.id = id;
		this.nombrePersona = nombrePersona;
		this.correoPersona = correoPersona;
		this.telefonoPersona = telefonoPersona;
		this.calificacion = calificacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public String getCorreoPersona() {
		return correoPersona;
	}

	public void setCorreoPersona(String correoPersona) {
		this.correoPersona = correoPersona;
	}

	public int getTelefonoPersona() {
		return telefonoPersona;
	}

	public void setTelefonoPersona(int telefonoPersona) {
		this.telefonoPersona = telefonoPersona;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	

	
	
}
