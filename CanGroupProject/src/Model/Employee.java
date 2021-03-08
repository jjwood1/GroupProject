package Model;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name="employees")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id") 
	private int id; 
	@Column(name="employee_name")
	private String name; 
	@Column(name="hire_date") 
	private LocalDate hireDate;
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
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", hireDate=" + hireDate + "]";
	} 
	
	
}
