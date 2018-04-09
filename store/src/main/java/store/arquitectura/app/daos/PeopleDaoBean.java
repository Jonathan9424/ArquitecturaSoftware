package store.arquitectura.app.daos;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import store.arquitectura.app.daosinterfaces.IPeopleDao;
import store.arquitectura.app.mappingtables.People;

@Stateless
public class PeopleDaoBean implements IPeopleDao {

	@Override
	public void addPeople(EntityManager em, People p) {
		em.persist(p);
	}

}
