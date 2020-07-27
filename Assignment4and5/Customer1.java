package Assignment4and5;

public class Customer1 {
	String customerName;
	String residentialAddress;
	public Customer1() {
		super();
	}
	public Customer1(String customerName, String residentialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void getResidentialAddress() {
		return;
	}
	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	String getCustomerDetails()
	{
		String str1="Customer : "+customerName+"Residential Address : "+residentialAddress;		
		return str1;
	}
}