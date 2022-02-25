package com.juank.gson;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

public class Candidate {

	private String id;
	private String id_party;
	private String name;
	private String name_party;
	private double votes;
	private float percent;
	
	
	
	public Candidate(String id, String id_party, String name, String name_party, double votes, float percent) {
		super();
		this.id = id;
		this.id_party = id_party;
		this.name = name;
		this.name_party = name_party;
		this.votes = votes;
		this.percent = percent;
	}



	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}



	/**
	 * @return the id_party
	 */
	public String getId_party() {
		return id_party;
	}



	/**
	 * @param id_party the id_party to set
	 */
	public void setId_party(String id_party) {
		this.id_party = id_party;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the name_party
	 */
	public String getName_party() {
		return name_party;
	}



	/**
	 * @param name_party the name_party to set
	 */
	public void setName_party(String name_party) {
		this.name_party = name_party;
	}



	/**
	 * @return the votes
	 */
	public double getVotes() {
		return votes;
	}



	/**
	 * @param votes the votes to set
	 */
	public void setVotes(double votes) {
		this.votes = votes;
	}



	/**
	 * @return the percent
	 */
	public float getPercent() {
		return percent;
	}



	/**
	 * @param percent the percent to set
	 */
	public void setPercent(float percent) {
		this.percent = percent;
	}

	
}


