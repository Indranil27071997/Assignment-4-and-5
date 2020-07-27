package Assignment4and5;

import java.util.Scanner;

public class TestCustomer {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		Customer customer=new Customer();
		address address=new address("mahendra bagchi road","Kolkata");
		address officeaddress=new address("mahendra bagchi road","bally");
		//System.out.println("enter customer name");
		//(scan.nextLine());
		customer.setCustomerName("Abhinav");
		//System.out.println("enter customer address");
		customer.setResidentialAddress(address);
		customer.setOfficialAddress(officeaddress);
		System.out.println(customer.getCustomerDetails());
		//customer.getResidentialAddress();
		scan.close();
	}

}

