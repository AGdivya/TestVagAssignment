package model;

import java.util.List;

public class Team {
	
	private String name;
	String location;
	List<Player> player;
	@Override
	public String toString() {
		return "Team [name=" + name + ", location=" + location + ", player=" + player + "]";
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Player> getPlayer() {
		return player;
	}
	public void setPlayer(List<Player> player) {
		this.player = player;
	}
	

}
