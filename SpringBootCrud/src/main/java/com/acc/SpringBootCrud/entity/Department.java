package com.acc.SpringBootCrud.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	private int iddepartment;

	@Override
	public String toString() {
		return "Department [iddepartment=" + iddepartment + ", name=" + name + "]";
	}

	public int getIddepartment() {
		return iddepartment;
	}

	public void setIddepartment(int iddepartment) {
		this.iddepartment = iddepartment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
}
