package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ItineraryRepository;
import com.app.dto.FlightDetailsDto;
import com.app.entity.Itinerary;



@Service
public class Itenaryimpli implements IItenary {

	@Autowired
	private ItineraryRepository it;

	@Override
	public List<FlightDetailsDto> getdetails() {
		 return it.listAll();
		
	}
	@Override
	public void adddetails(Itinerary itinerary) {
		it.save(itinerary );
	}
	
	@Override
	public void deleteItenary(int theId) {
		 
		it.deleteById(theId);
	}
	public List<Itinerary> showitenary() {
		 
		return (List<Itinerary>) it.findAll();
	}
	
	@Override
	public List<FlightDetailsDto> search(int flightId) {
		 return it.Search(flightId);
	}

	
}
