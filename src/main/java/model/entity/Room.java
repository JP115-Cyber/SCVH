package model.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import model.interfaces.Ientity;



@Entity
public class Room implements Ientity {

	@Id
	private String roomCode;

	@ManyToOne
	@JoinColumn(name = "rule", referencedColumnName = "ruleCode")
	private Rule rule;

	@OneToMany
	@JoinColumn(name = "room", referencedColumnName = "roomCode")
	private List<Bed> beds;

	public String getRoomCode() {
		return roomCode;
	}

	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}

	public Rule getRule() {
		return rule;
	}

	public void setRule(Rule rule) {
		this.rule = rule;
	}

	public List<Bed> getBeds() {
		return beds;
	}

	public void setBeds(List<Bed> beds) {
		this.beds = beds;
	}

	public Room() {

	}

	public Room(String roomCode, Rule rule, List<Bed> beds) {
		this.roomCode = roomCode;
		this.rule = rule;
		this.beds = beds;
	}

	public void register(Room room, Sector sector) {

	}

	@Override
	public Object getKey() {
		// TODO Auto-generated method stub
		return this.roomCode;
	}

}
