package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.dto.FlightDetailsDto;
import com.app.entity.Itinerary;
@Repository
public interface ItineraryRepository extends CrudRepository<Itinerary, Integer> {
	
	@Query("SELECT new com.app.dto.FlightDetailsDto(i.itineraryId, i.flightId, i.DepAirport, i.DepDate, i.DepTime, i.ArrAirport, i.ArrDate, i.ArrTime, f.flightName)FROM Itinerary i INNER JOIN i.flight f ORDER BY i.flightId")
	public List<FlightDetailsDto> listAll();
	@Query("SELECT new com.app.dto.FlightDetailsDto(i.itineraryId, i.flightId, i.DepAirport, i.DepDate, i.DepTime, i.ArrAirport, i.ArrDate, i.ArrTime, f.flightName)FROM Itinerary i INNER JOIN i.flight f WHERE i.flightId like ?1")
	public List<FlightDetailsDto> Search(int flightId );
}
 