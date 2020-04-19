package org.capg.service;

import java.util.List;

import org.capg.entities.Trainee;

public interface ITraineeService {

    void add(Trainee trainee);
	
	Trainee findById(int id);
	
	Trainee delete(Trainee trainee);
	
	Trainee modify(int id);
	
	List<Trainee> retreiveAll();

}
