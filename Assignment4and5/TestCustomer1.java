package Assignment4and5;

import java.util.Scanner;
public class TestCustomer1 {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		Customer customer=new Customer();
		Address1 address=new Address1("5 C Radha Kanta Jew Street", "Kolkata");
		//System.out.println("enter customer name");
		//(scan.nextLine());
		customer.setCustomerName("Indranil");
		//System.out.println("enter customer address");
		customer.setResidentialAddress(address);
		System.out.println(customer.getCustomerDetails());
		//customer.getResidentialAddress();
		scan.close();
	}

}