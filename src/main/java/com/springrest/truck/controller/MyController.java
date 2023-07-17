package com.springrest.truck.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.truck.entities.Truck;
import com.springrest.truck.services.TruckService;

@RestController
public class MyController {
	
	@Autowired
	private TruckService truckService;
	
	
	//getting all the details of delivery
	@GetMapping("/load")
	public List<Truck> getTrucks(){
		
		return this.truckService.getTrucks();
	}
	
	//getting info about delivery by id
	@GetMapping("/load/{loadId}")
	public Truck getTruck(@PathVariable String loadId) {
		
		return this.truckService.getTruck(Long.parseLong(loadId));
	}
	
	//adding new delivery information
	@PostMapping("/load")
	public Truck addTruck(@RequestBody Truck truck) {
		
		return this.truckService.addTruck(truck);
	}

	//updating the delivery data
	@PutMapping("/load")
	public Truck updateTruck(@RequestBody Truck truck) {
		
		return this.truckService.updateTruck(truck);
	}
	
	//delete the course
	@DeleteMapping("/load/{loadId}")
	public ResponseEntity<HttpStatus> deleteTruck(@PathVariable String loadId){
			
		try {
				this.truckService.deleteTruck(Long.parseLong(loadId));
				return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
