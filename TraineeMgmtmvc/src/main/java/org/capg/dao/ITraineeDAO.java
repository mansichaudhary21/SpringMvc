package org.capg.dao;

import java.util.List;

import org.capg.entities.Trainee;

public interface ITraineeDAO {
	
	void add(Trainee trainee);
	
	Trainee findById(int id);
	
	Trainee delete(Trainee trainee);
	
	Trainee modify(int id);
	
	List<Trainee> retreiveAll();

}
