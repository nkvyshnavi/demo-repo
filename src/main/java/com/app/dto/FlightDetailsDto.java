package com.app.dto;

import java.util.Date;

public class FlightDetailsDto {
	private int itineraryId;
	private int flightId;
	private String DepAirport;
	private Date DepDate;
	private String DepTime;
	private String ArrAirport;
	private Date ArrDate;
	private String ArrTime;
	private String flightName;
	public FlightDetailsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FlightDetailsDto(int itineraryId, int flightId, String depAirport, Date depDate, String depTime,
			String arrAirport, Date arrDate, String arrTime, String flightName) {
		super();
		this.itineraryId = itineraryId;
		this.flightId = flightId;
		this.DepAirport = depAirport;
		this.DepDate = depDate;
		this.DepTime = depTime;
		this.ArrAirport = arrAirport;
		this.ArrDate = arrDate;
		this.flightName = flightName;
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
	public String getDepAirport() {
		return DepAirport;
	}
	public void setDepAirport(String depAirport) {
		this.DepAirport = depAirport;
	}
	public Date getDepDate() {
		return DepDate;
	}
	public void setDepDate(Date depDate) {
		this.DepDate = depDate;
	}
	public String getDepTime() {
		return DepTime;
	}
	public void setDepTime(String depTime) {
		this.DepTime = depTime;
	}
	public String getArrAirport() {
		return ArrAirport;
	}
	public void setArrAirport(String arrAirport) {
		this.ArrAirport = arrAirport;
	}
	public Date getArrDate() {
		return ArrDate;
	}
	public void setArrDate(Date arrDate) {
		this.ArrDate = arrDate;
	}
	public String getArrTime() {
		return ArrTime;
	}
	public void setArrTime(String arrTime) {
		this.ArrTime = arrTime;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	@Override
	public String toString() {
		return "FlightDetailsDto [itineraryId=" + itineraryId + ", flightId=" + flightId + ", DepAirport=" + DepAirport
				+ ", DepDate=" + DepDate + ", DepTime=" + DepTime + ", ArrAirport=" + ArrAirport + ", ArrDate="
				+ ArrDate + ", ArrTime=" + ArrTime + ", flightName=" + flightName + "]";
	}
	
	
	
}
