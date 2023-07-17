package com.springrest.truck.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.truck.dao.TruckDao;
import com.springrest.truck.entities.Truck;


@Service
public class TruckServiceImpl implements TruckService {
	
	@Autowired
	private TruckDao truckDao;
	
	@Override
	public List<Truck> getTrucks() {
		
		return truckDao.findAll();
	}


	@Override
	public Truck getTruck(Long loadId) {
			
		return truckDao.getOne(loadId);
	}

	@Override
	public Truck addTruck(Truck truck) {
		
		truckDao.save(truck);
		return truck;
	}

	
	@Override
	public Truck updateTruck(Truck truck) {
	
		truckDao.save(truck);
		return truck;
	}


	@Override
	public void deleteTruck(long parseLong) {
		
		@SuppressWarnings("deprecation")
		Truck entity = truckDao.getOne(parseLong);
		truckDao.delete(entity);
		
	}

	

}
