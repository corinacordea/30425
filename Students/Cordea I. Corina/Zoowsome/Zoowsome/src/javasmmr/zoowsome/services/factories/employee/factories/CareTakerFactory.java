package javasmmr.zoowsome.services.factories.employee.factories;
import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.services.factories.*;

public class CareTakerFactory extends EmployeeFactory{
	public Employee getEmployeeFactory(String type) throws Exception{
		if(Constants.Employees.CARETAKER.equals(type))
			return new CareTaker();
		else
			throw new Exception("Invalid employee specification");
	}
}
