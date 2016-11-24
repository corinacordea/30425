package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;
import java.util.*;

public abstract class Employee {
	private String name;
	private long id;
	private BigDecimal salary;
	private boolean isDead;
	
	public Employee(String name, BigDecimal salary, boolean isDead){
		setId();
		setName(name);
		setSalary(salary);
		setIsDead(isDead);
	}
	public long getId(){
		 return this.id;
	}
	
	public void setId() {
		Random random = new Random();
		this.id = random.nextLong();
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public BigDecimal getSalary(){
		return this.salary;
	}
	public void setSalary(BigDecimal salary){
		this.salary = salary;
	}
	public boolean getIsDead(){
		return this.isDead;
	}
	public void setIsDead(boolean isDead){
		this.isDead = isDead;
	}
	
}
