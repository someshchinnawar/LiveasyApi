package com.springrest.truck.services;

import java.util.List;

import com.springrest.truck.entities.Truck;

public interface TruckService {
	
	public List<Truck> getTrucks();
	
	public Truck getTruck(Long loadId);
	
	public Truck addTruck(Truck truck);
	
	public Truck updateTruck(Truck truck);
	
	public void deleteTruck(long parseLong);
	
}
