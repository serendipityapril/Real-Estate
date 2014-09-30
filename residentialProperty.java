package lab9;

public class residentialProperty {
	private int id;
	private String address;
	private int numberStories;
	private int age;
	private boolean purpose;
	private boolean multiple;
	private boolean externalWater;
	private int porchSize;
	private int yardSize;
	
	public residentialProperty(property i){
		address = i.getAddress();
		id = i.getId();
		numberStories = i.getNumberStories();
		age = i.getAge();
		purpose = i.isPurpose();
	}
	
	public boolean isMultiple() {
		return multiple;
	}

	public void setMultiple(boolean multiple) {
		this.multiple = multiple;
	}

	public boolean isExternalWater() {
		return externalWater;
	}

	public void setExternalWater(boolean externalWater) {
		this.externalWater = externalWater;
	}

	public int getPorchSize() {
		return porchSize;
	}

	public void setPorchSize(int porchSize) {
		this.porchSize = porchSize;
	}

	public int getYardSize() {
		return yardSize;
	}

	public void setYardSize(int yardSize) {
		this.yardSize = yardSize;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNumberStories() {
		return numberStories;
	}
	public void setNumberStories(int numberStories) {
		this.numberStories = numberStories;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isPurpose() {
		return purpose;
	}
	public void setPurpose(boolean purpose) {
		this.purpose = purpose;
	}
}
