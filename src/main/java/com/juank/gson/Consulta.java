package com.juank.gson;

import java.text.DecimalFormat;
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
	private double tables_installed;
	private double informed_tables;
	private String hour;
	private String date;
	private double invalid_votes;
	private float reported_tables_percentage;
	Set<Candidate> candidates;

	

	
	public Consulta(int number, double tables_installed, double informed_tables, String hour, String date,
			double invalid_votes, float reported_tables_percentage) {
		super();
		this.number = number;
		this.tables_installed = tables_installed;
		this.informed_tables = informed_tables;
		this.hour = hour;
		this.date = date;
		this.invalid_votes = invalid_votes;
		this.reported_tables_percentage = reported_tables_percentage;
		this.candidates = new HashSet<Candidate>();
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
	public double getTables_installed() {
		return tables_installed;
	}

	/**
	 * @param tables_installed the tables_installed to set
	 */
	public void setTables_installed(double tables_installed) {
		this.tables_installed = tables_installed;
	}

	/**
	 * @return the informed_tables
	 */
	public double getInformed_tables() {
		return informed_tables;
	}

	/**
	 * @param informed_tables the informed_tables to set
	 */
	public void setInformed_tables(double informed_tables) {
		this.informed_tables = informed_tables;
	}

	/**
	 * @return the hour
	 */
	public String getHour() {
		return hour;
	}

	/**
	 * @param hour the hour to set
	 */
	public void setHour(String hour) {
		this.hour = hour;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the invalid_votes
	 */
	public double getInvalid_votes() {
		return invalid_votes;
	}

	/**
	 * @param invalid_votes the invalid_votes to set
	 */
	public void setInvalid_votes(double invalid_votes) {
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
	public Set<Candidate> getCandidates() {
		return candidates;
	}

	/**
	 * @param candidates the candidates to set
	 */
	public void setCandidates(Set<Candidate> candidates) {
		this.candidates = candidates;
	}
	
	

}