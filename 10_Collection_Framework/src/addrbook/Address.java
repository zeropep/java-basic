package addrbook;

// VO
public class Address {
	private String name;
	private String tel;
	private String address;
	
	// VO는 형태가 거의 정해져있음.
	// default 생성자, overloaded 생성자, getter&setter, toString
	// 이후에 이 작업을 한줄의 코드로 대신해 줄 수 있는 기능이 있음.
	
	public Address() {}

	public Address(String name, String tel, String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address [name=" + name + ", tel=" + tel + ", address=" + address + "]";
	}
	
}
