package model;

import com.google.gson.annotations.SerializedName;

public class Player {
	
	String name;
	String country;
	Role role;
	@SerializedName(value = "price-in-crores")String priceincrores;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getPriceincrores() {
		return priceincrores;
	}
	public void setPriceincrores(String priceincrores) {
		this.priceincrores = priceincrores;
	}
	
	

}
