package javasmmr.zoowsome.services.factories.employee.factories;
import javasmmr.zoowsome.models.employees.Employee;

public abstract class EmployeeFactory {
	public abstract Employee getEmployeeFactory(String type) throws Exception;
}
