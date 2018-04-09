package store.arquitectura.app.facade;

import javax.ejb.Local;

import store.arquitectura.app.mappingtables.People;

@Local
public interface IPeopleController {

	public void addPeople(People p);

}
