package com.demo.model;

public class Employee {

	    public int id;
	    public String name;
	    public int salary;
		public Employee(int id, String name, int salary) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
		public int getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public int getSalary() {
			return salary;
		}
	    public void setId(int id) {
			this.id = id;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setSalary(int salary) {
			this.salary = salary;
	}
}
	