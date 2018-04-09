package store.arquitectura.app.daosinterfaces;

import javax.ejb.Local;
import javax.persistence.EntityManager;

import store.arquitectura.app.mappingtables.People;

@Local
public interface IPeopleDao {

	public void addPeople(EntityManager em, People p);

}
