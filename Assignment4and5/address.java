package Assignment4and5;

public class address {
	@Override
	public String toString() {
		return "Address= " + addressLine + ", city=" + city ;
	}
	String addressLine;
	public address(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
	}
	String city;
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	String getAddressDetails()
	{
		String str=addressLine+" ,"+city;
		return str;
	}

}



