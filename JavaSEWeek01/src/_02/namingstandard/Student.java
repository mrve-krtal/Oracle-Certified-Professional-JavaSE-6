package _02.namingstandard;

public class Student {
	
	//getter-setter oluþturma iþini ide'e býrak.
	private int id;
	private String name;
	private String surname;
	private String adsress;
	private boolean active;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getAdsress() {
		return adsress;
	}
	public void setAdsress(String adsress) {
		this.adsress = adsress;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	

}
