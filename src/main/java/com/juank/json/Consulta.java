package com.juank.json;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

public class Consulta {

	private int number;
	private int tables_installed;
	private int informed_tables;
	private LocalTime hour;
	private LocalDate date;
	private int invalid_votes;
	private float reported_tables_percentage;
	List<Candidate> candidates;

	
	
	public Consulta(int number, int tables_installed, int informed_tables, String hour, String date,
			int invalid_votes, float reported_tables_percentage) {
		super();
		this.number = number;
		this.tables_installed = tables_installed;
		this.informed_tables = informed_tables;
		this.hour = LocalTime.parse(hour);
		this.date = LocalDate.parse(date);
		this.invalid_votes = invalid_votes;
		this.reported_tables_percentage = reported_tables_percentage;
		this.candidates = new ArrayList<Candidate>();
	}

	
	public Consulta addCandidate(Candidate candidate) {
		this.candidates.add(candidate);
		return this;

	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @return the tables_installed
	 */
	public int getTables_installed() {
		return tables_installed;
	}

	/**
	 * @param tables_installed the tables_installed to set
	 */
	public void setTables_installed(int tables_installed) {
		this.tables_installed = tables_installed;
	}

	/**
	 * @return the informed_tables
	 */
	public int getInformed_tables() {
		return informed_tables;
	}

	/**
	 * @param informed_tables the informed_tables to set
	 */
	public void setInformed_tables(int informed_tables) {
		this.informed_tables = informed_tables;
	}

	/**
	 * @return the hour
	 */
	public LocalTime getHour() {
		return hour;
	}

	/**
	 * @param hour the hour to set
	 */
	public void setHour(LocalTime hour) {
		this.hour = hour;
	}

	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * @return the invalid_votes
	 */
	public int getInvalid_votes() {
		return invalid_votes;
	}

	/**
	 * @param invalid_votes the invalid_votes to set
	 */
	public void setInvalid_votes(int invalid_votes) {
		this.invalid_votes = invalid_votes;
	}

	/**
	 * @return the reported_tables_percentage
	 */
	public float getReported_tables_percentage() {
		return reported_tables_percentage;
	}

	/**
	 * @param reported_tables_percentage the reported_tables_percentage to set
	 */
	public void setReported_tables_percentage(float reported_tables_percentage) {
		this.reported_tables_percentage = reported_tables_percentage;
	}

	/**
	 * @return the candidates
	 */
	public List<Candidate> getCandidates() {
		return candidates;
	}

	/**
	 * @param candidates the candidates to set
	 */
	public void setCandidates(List<Candidate> candidates) {
		this.candidates = candidates;
	}

	public String toJson() {

		

		JsonArrayBuilder builderCandidates = Json.createArrayBuilder();
		
		for(Candidate candidateI : this.candidates) {
			builderCandidates.add(candidateI.toJson());
		}
		
		JsonArray candidatesJson = builderCandidates.build();
		
		JsonObjectBuilder builderConsulta = Json.createObjectBuilder();
		builderConsulta.add("number", this.number)
					   .add("tables_installed", this.tables_installed)
					   .add("informed_tables", this.informed_tables)
					   .add("hour", this.hour.toString())
					   .add("date", this.date.toString())
					   .add("invalid_votes", this.invalid_votes)
					   .add("reported_tables_percentage", this.reported_tables_percentage)
					   .add("Candidates",candidatesJson);

		JsonObject consultaJson = builderConsulta.build();
		return consultaJson.toString();

	}



		
	

}