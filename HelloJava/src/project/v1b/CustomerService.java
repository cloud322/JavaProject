package project.v1b;

public interface CustomerService {
	void addCustomer(CustomerV0 cs);	
	String getCustomer();
	String getCustomer(String name);
	void modifyCustomer(CustomerV0 cs);
	void removeCustomer(String name);

}
