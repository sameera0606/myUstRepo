package com.example.labour.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.labour.model.Labourer;
import com.example.labour.repository.LaborRepo;

@Service
public class LaborService {

	@Autowired
	private LaborRepo repo;

	public Labourer saveLabor(Labourer labor) {
		return repo.save(labor);
		
		
		
	}

	public List<Labourer> getByLocation(String location) {
		List<Labourer> list = repo.findByLocation(location);
		return list;
	}
	public List<Labourer> retrieveAllLabour(){
		return repo.findAll();
	}
	public Labourer updateLaborDetails(Labourer labour) {
		Labourer labor=repo.findById(labour.getId()).get();
		if(labor.equals(null)) {
			System.out.println("Id not exist!!!");
		}
		else {
		labor.setId(labour.getId());	
		labor.setAadhar(labour.getAadhar());
		labor.setExperience(labour.getExperience());
		labor.setFonNumber(labour.getFonNumber());
		labor.setLocation(labour.getLocation());
		labor.setName(labour.getName());
		labor.setSkill(labour.getSkill());
		}
		return repo.save(labor);

	}

	public String deleteDetails(int id) {
		repo.deleteById(id);
		return "Details of labourer with id: "+id+" deleted successfully";
	}

	
	}
