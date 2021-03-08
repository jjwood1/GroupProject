package Model;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name="purchases")
public class Purchases {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id; 
	@ManyToOne(cascade= CascadeType.PERSIST) 
	@JoinColumn(name="can_id")
	private Can can; 
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="employee_id") 
	private Employee employee; 
	@Column(name="purchase_date")
	private LocalDate date;
	@Override
	public String toString() {
		return "Purchases [id=" + id + ", can=" + can + ", employee=" + employee + ", date=" + date + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Can getCan() {
		return can;
	}
	public void setCan(Can can) {
		this.can = can;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
}
