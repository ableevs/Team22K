package rgr;

public abstract class Material {

	String name;
	String install_price;
	
	public String getName() {
		return name;
	}
	public String getPrice() {
		return install_price;
	}
	
	public abstract void setName(String name);
	public abstract void setPrice(String price);
}
