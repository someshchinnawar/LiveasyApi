package com.springrest.truck.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Truck {
	
	@Id
	private long id;
	private String loadingPoint;
	private String unloadingPoint;
	private String productTpye;
	private String truckTpye;
	private int noOfTrucks;
	private double weight;
	private long shipperId;
	private String date;
	public Truck(long id, String loadingPoint, String unloadingPoint, String productTpye, String truckTpye, int noOfTrucks, double weight,
			long shipperId, String date) {
		super();
		this.id = id;
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productTpye = productTpye;
		this.truckTpye = truckTpye;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.shipperId = shipperId;
		this.date = date;
	}
	public Truck() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public String getProductTpye() {
		return productTpye;
	}
	public void setProductTpye(String productTpye) {
		this.productTpye = productTpye;
	}
	public String getTruckTpye() {
		return truckTpye;
	}
	public void setTruckTpye(String truckTpye) {
		this.truckTpye = truckTpye;
	}
	public int getNoOfTrucks() {
		return noOfTrucks;
	}
	public void setNoOfTrucks(int noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public long getShipperId() {
		return shipperId;
	}
	public void setShipperId(long shipperId) {
		this.shipperId = shipperId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Truck [id=" + id + ", loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint +  ", productTpye=" + productTpye + ", truckTpye="
				+ truckTpye + ", noOfTrucks=" + noOfTrucks + ", weight=" + weight + ", shipperId=" + shipperId
				+ ", date=" + date + ", getId()=" + getId() + ", getLoadingPoint()=" + getLoadingPoint()
				+ ", getProductTpye()=" + getProductTpye() + ", getTruckTpye()=" + getTruckTpye() + ", getNoOfTrucks()="
				+ getNoOfTrucks() + ", getWeight()=" + getWeight() + ", getShipperId()=" + getShipperId()
				+ ", getDate()=" + getDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
