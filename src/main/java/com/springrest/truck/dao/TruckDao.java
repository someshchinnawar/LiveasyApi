package com.springrest.truck.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.truck.entities.Truck;

public interface TruckDao extends JpaRepository<Truck,Long>{

}
