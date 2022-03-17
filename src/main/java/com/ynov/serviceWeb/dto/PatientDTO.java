package com.ynov.serviceWeb.dto;

public class PatientDTO {

	private String id;
	private String name;
	private int age;
	private String id_pro;

	public PatientDTO() {
	}

	public PatientDTO(String name, int age, String id_pro) {
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

}
