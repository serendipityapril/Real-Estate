package lab9;

public class commercialProperty {
	private int id;
	private String address;
	private int numberStories;
	private int age;
	private boolean purpose;
	private int mode;
	private boolean food;
	private boolean resAlso;
	private boolean parking;
	
	public commercialProperty(property i){
		address = i.getAddress();
		id = i.getId();
		numberStories = i.getNumberStories();
		age = i.getAge();
		purpose = i.isPurpose();
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

	public int getMode() {
		return mode;
	}

	public void setMode(int mode) {
		this.mode = mode;
	}

	public boolean isFood() {
		return food;
	}

	public void setFood(boolean food) {
		this.food = food;
	}

	public boolean isResAlso() {
		return resAlso;
	}

	public void setResAlso(boolean resAlso) {
		this.resAlso = resAlso;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}
}
