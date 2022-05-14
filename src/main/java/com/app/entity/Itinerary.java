package com.app.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Itinerary {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int itineraryId;
	private int flightId;
	@ManyToOne
	@JoinColumn(name="flightId", insertable = false, updatable = false)
	private Flight flight;
	
	private String DepAirport;
	private Date DepDate;
	private String DepTime;
	private String ArrAirport;
	private Date ArrDate;
	private String ArrTime;
	public Itinerary() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Itinerary(int itineraryId, int flightId, Flight flight, String depAirport, Date depDate, String depTime,
			String arrAirport, Date arrDate, String arrTime) {
		super();
		this.itineraryId = itineraryId;
		this.flightId = flightId;
		this.flight = flight;
		DepAirport = depAirport;
		DepDate = depDate;
		DepTime = depTime;
		ArrAirport = arrAirport;
		ArrDate = arrDate;
		ArrTime = arrTime;
	}
	public int getItineraryId() {
		return itineraryId;
	}
	public void setItineraryId(int itineraryId) {
		this.itineraryId = itineraryId;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	@JsonBackReference
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public String getDepAirport() {
		return DepAirport;
	}
	public void setDepAirport(String depAirport) {
		DepAirport = depAirport;
	}
	public Date getDepDate() {
		return DepDate;
	}
	public void setDepDate(Date depDate) {
		DepDate = depDate;
	}
	public String getDepTime() {
		return DepTime;
	}
	public void setDepTime(String depTime) {
		DepTime = depTime;
	}
	public String getArrAirport() {
		return ArrAirport;
	}
	public void setArrAirport(String arrAirport) {
		ArrAirport = arrAirport;
	}
	public Date getArrDate() {
		return ArrDate;
	}
	public void setArrDate(Date arrDate) {
		ArrDate = arrDate;
	}
	public String getArrTime() {
		return ArrTime;
	}
	public void setArrTime(String arrTime) {
		ArrTime = arrTime;
	}
	@Override
	public String toString() {
		return "Itinerary [itineraryId=" + itineraryId + ", flightId=" + flightId + ", flight=" + flight
				+ ", DepAirport=" + DepAirport + ", DepDate=" + DepDate + ", DepTime=" + DepTime + ", ArrAirport="
				+ ArrAirport + ", ArrDate=" + ArrDate + ", ArrTime=" + ArrTime + "]";
	}
	
	
	
}
