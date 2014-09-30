package lab9;

public class property{
	private int id;
	private String address;
	private int numberStories;
	private int age;
	private boolean purpose;
	
	public property(int id){
		this.id = id;
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
