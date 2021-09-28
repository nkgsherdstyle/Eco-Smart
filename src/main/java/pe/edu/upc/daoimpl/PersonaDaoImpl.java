package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPersonaDao;
import pe.edu.upc.entity.Persona;

public class PersonaDaoImpl implements IPersonaDao, Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "b")	
	
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Persona persona) {
		// TODO Auto-generated method stub
		em.persist(persona);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		
		List<Persona> lista = new ArrayList<Persona>();
		Query q= em.createQuery("select m from Persona m");
		lista = (List<Persona>) q.getResultList();
		return lista;
	}
	@Transactional
	@Override
	public void eliminar(int idPersona) {
		// TODO Auto-generated method stub
		
		Persona persona = new Persona();
		persona=em.getReference(Persona.class, idPersona);
		em.remove(persona);
		
	}
	
	
}
