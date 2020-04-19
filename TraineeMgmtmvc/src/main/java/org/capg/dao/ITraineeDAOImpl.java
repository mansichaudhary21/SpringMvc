package org.capg.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.capg.entities.Trainee;
import org.springframework.stereotype.Repository;

@Repository
public class ITraineeDAOImpl implements ITraineeDAO{

	private Map<Integer,Trainee> store = new HashMap<Integer,Trainee>();
	
	public void add(Trainee trainee) {
		
		store.put(trainee.getTraineeId(), trainee);	
	}

	public Trainee findById(int id) {
		Trainee t = store.get(id);
		return t;
	}

	public List<Trainee> retreiveAll() {
		Collection<Trainee> collection = store.values();
		List<Trainee> list = new ArrayList<Trainee>(collection);
		return list;
	}

	public Trainee delete(Trainee trainee) {
		// TODO Auto-generated method stub
		Trainee t = store.remove(trainee);
		return t;
	}

	public Trainee modify(int id) {
		// TODO Auto-generated method stub
		Trainee t = new Trainee();
		return t;
	}

}
