package org.capg.service;

import java.util.List;

import org.capg.dao.ITraineeDAO;
import org.capg.dao.ITraineeDAOImpl;
import org.capg.entities.Trainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ITraineeServiceImpl implements ITraineeService{
	
	
	private ITraineeDAO dao;

	public ITraineeDAO getDao() {
		return dao;
	}
	@Autowired
	public void setDao(ITraineeDAO dao) {
		this.dao = dao;
	}
	
	public ITraineeServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public ITraineeServiceImpl(ITraineeDAO dao) {
		this.dao = dao;
	}
	
	
	public void add(Trainee trainee) {
			dao.add(trainee);
	}

	public Trainee findById(int id) {
		
		Trainee trainee = dao.findById(id);
		return trainee;
	}

	public List<Trainee> retreiveAll() {
		List<Trainee> list = dao.retreiveAll();
		return list;
	}
	
	public static ITraineeServiceImpl newInstance()
	{
		return  new ITraineeServiceImpl(new ITraineeDAOImpl());
	}

	public Trainee delete(Trainee trainee) {
		// TODO Auto-generated method stub
		Trainee t =dao.delete(trainee);
		return t;
	}

	public Trainee modify(int id) {
		// TODO Auto-generated method stub
		Trainee t = new Trainee();
		return t;
	}

}
