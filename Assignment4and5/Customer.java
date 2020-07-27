package Assignment4and5;

public class Customer {
	String customerName;
	address residentialAddress;
	address officialAddress;
	public Customer() {
		super();
	}
	public Customer(String customerName, address residentialAddress) {
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
	public address getResidentialAddress() {
		return residentialAddress;
	}
	
	public address getOfficialAddress() {
		return officialAddress;
	}
	public void setOfficialAddress(address officialAddress) {
		this.officialAddress = officialAddress;
	}
	public void setResidentialAddress(Address1 address) {
		this.residentialAddress = address;
	}
	String getCustomerDetails()
	{
		String str1="Customer : "+customerName+"\nResidential Address : "+residentialAddress+"\noffice Address="+officialAddress;		
		return str1;
	}
}