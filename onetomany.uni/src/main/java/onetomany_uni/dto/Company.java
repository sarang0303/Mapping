package onetomany_uni.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import Employee.Employee;
@Entity
public class Company {
	@Id
	private int id;
	private String name;
	private String location;
	private String gst;
	
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getGst() {
		return gst;
	}

	public void setGst(String gst) {
		this.gst = gst;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@OneToMany
	private List<Employee> employees;

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", location=" + location + ", gst=" + gst + ", employees="
				+ employees + "]";
	}
	

}
