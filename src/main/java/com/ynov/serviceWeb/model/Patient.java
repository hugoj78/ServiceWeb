package com.ynov.serviceWeb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "patients")
public class Patient {

	@Id
	private String id;
	private String name;
	private int age;
	private String id_pro;

	public Patient() {
	}

	public Patient(String name, int age, String id_pro) {
		this.name = name;
		this.age = age;
		this.id_pro = id_pro;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getId_pro() {
		return id_pro;
	}

	public void setId_pro(String id_pro) {
		this.id_pro = id_pro;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", id_pro=" + id_pro + "]";
	}

}
