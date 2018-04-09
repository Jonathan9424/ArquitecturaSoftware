package store.arquitectura.app.model;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import store.arquitectura.app.daosinterfaces.IPeopleDao;
import store.arquitectura.app.facade.IPeopleController;
import store.arquitectura.app.mappingtables.People;

@Stateless
public class PeopleControllerBean implements IPeopleController {

	@PersistenceContext(name = "store")
	EntityManager em;

	@EJB
	private IPeopleDao ip;

	@Override
	public void addPeople(People p) {
		ip.addPeople(em, p);
	}

}
