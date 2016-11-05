package javasmmr.zoowsome.services.factories.employeeFactories;
import javasmmr.zoowsome.models.employees.*;

public abstract class EmployeeFactory {

	public abstract Employee getEmployeeFactory(String type) throws Exception;
}
