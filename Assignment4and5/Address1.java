package Assignment4and5;

public class Address1 {
	@Override
	public String toString() {
		return "Address [addressLine=" + addressLine + ", city=" + city + "]";
	}
	String addressLine;
	String city;
	public Address1(String addressLine, String city)
	{
		this.addressLine=addressLine;
		this.city=city;
	}
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