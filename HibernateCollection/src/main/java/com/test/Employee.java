package com.test;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name = "employee")
public class Employee {
	private int id;
	private String e_name;
	private List<String> skills;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	

}
