
public class Address {
	int flatNumber;
	String flatName,roadName,cityName;
	
	public Address(int flatNumber, String flatName, String roadName, String cityName) {
		super();
		this.flatNumber = flatNumber;
		this.flatName = flatName;
		this.roadName = roadName;
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Address [flatNumber=" + flatNumber + ", flatName=" + flatName + ", roadName=" + roadName + ", cityName="
				+ cityName + "]";
	}
	
}
