package com.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class truck_model {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int capacity;
	private int loading;
	private String route;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getLoading() {
		return loading;
	}
	public void setLoading(int loading) {
		this.loading = loading;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	@Override
	public String toString() {
		return "truck_model [id=" + id + ", name=" + name + ", capacity=" + capacity + ", loading=" + loading
				+ ", route=" + route + "]";
	}
	
	
	

}
