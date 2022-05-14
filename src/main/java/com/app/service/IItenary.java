package com.app.service;

import java.util.List;

import com.app.dto.FlightDetailsDto;
import com.app.entity.Itinerary;

public interface IItenary {

	List<FlightDetailsDto> getdetails();

	

	void adddetails(Itinerary itinerary);
	public void deleteItenary(int theId);



	public List<Itinerary> showitenary();



	List<FlightDetailsDto> search(int flightId);

	

}
