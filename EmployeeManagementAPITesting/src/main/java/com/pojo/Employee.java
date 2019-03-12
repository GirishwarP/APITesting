package com.pojo;

public class Employee implements Comparable<Employee>{

	private int id;
	private String name;
	private String profession;

	public Employee(int id, String name, String profession) {
		this.id = id;
		this.name = name;
		this.profession = profession;
	}

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

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	public int compareTo(Employee emp) {
		if(this.id > emp.getId()) 
			return 1;
		else if(this.id < emp.getId())
			return -1;
		else 
			return 0;
	}

	public static class Builder {
		private int id;
		private String name;
		private String profession;

		public Builder setId(int id) {
			this.id = id;
			return this;
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setProfession(String profession) {
			this.profession = profession;
			return this;
		}
		
		public Employee build() {
			return new Employee(id, name, profession);
		}
	}	
}
