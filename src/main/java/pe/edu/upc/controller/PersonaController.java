package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Persona;
import pe.edu.upc.service.IPersonaService;

@Named
@RequestScoped
public class PersonaController implements Serializable {


	private static final long serialVersionUID = 1L;
	
	
	@Inject
	private IPersonaService mService;
	private Persona persona;
	List<Persona> listaPersona;
	@PostConstruct
	public void init() {
		this.listaPersona=new ArrayList<Persona>();
		this.persona=new Persona();
		this.listar();
	}
	
	public String nuevaPersona() {
		this.setPersona(new Persona());
		return "persona.xhtml";
	}

	public void insertar() {
		mService.insertar(persona);
		limpiarPersona();
	}
	
	public void listar() {
		listaPersona =mService.listar();
	}
	
	public void limpiarPersona() {
		this.init();
	}
	
	public void eliminar(Persona persona) {
		mService.eliminar(persona.getId());
		this.listar();
	}
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public List<Persona> getListaPersona() {
		return listaPersona;
	}

	public void setListaPersona(List<Persona> listaPersona) {
		this.listaPersona = listaPersona;
	}
	
	
}
