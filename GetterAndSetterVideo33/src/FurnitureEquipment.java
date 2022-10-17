
public class FurnitureEquipment {
	
	private String name = "Plywood";
	private int wide = 200;
	private int llong = 250;
	private int area = wide*llong;
	private String serialNumber = "12345";
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWide() {
		return wide;
	}
	public void setWide(int wide) {
		this.wide = wide;
	}
	public int getLlong() {
		return llong;
	}
	public void setLlong(int llong) {
		this.llong = llong;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public String getSerialNumber() {
		return this.name.substring(0, 3) + wide;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	
	
	

}
 