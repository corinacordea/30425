package javasmmr.zoowsome.models.employees;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.*;
import java.math.BigDecimal;
import java.util.*;

public abstract class Employee {
	private String name;
	private long id;
	private BigDecimal salary;
	private boolean isDead;
	
	public long getId(){
		 return id;
	}
	
	public void setId() {
    Random random = new Random();
    char[] digits = new char[13];
    digits[0] = (char) (random.nextInt(10));
    for (int i = 1; i < 13; i++) {
        digits[i] = (char) (random.nextInt(10));
    }
    id = Long.parseLong(new String(digits));
    }
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public BigDecimal getSalary(){
		return salary;
	}
	public void setSalary(BigDecimal salary){
		this.salary = salary;
	}
	public boolean getIsDead(){
		return isDead;
	}
	public void setIsDead(boolean isDead){
		this.isDead = isDead;
	}
	public Employee(String name, BigDecimal salary, boolean isDead){
		setId();
		setSalary(salary);
		setIsDead(isDead);
	}
	
}
