package com.app.rest;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.FlightDetailsDto;
import com.app.entity.Itinerary;
import com.app.service.IItenary;




@RestController
@CrossOrigin
@RequestMapping("/api")
public class IrenaryController {

	@Autowired
	private IItenary itenar;
	
	//list all flightdetails
		@GetMapping("/flightdetails")
		public List<FlightDetailsDto> getAlldetails(){
			return itenar.getdetails();
	}

		//Add flightdetails
		@PostMapping("/flights")
		public void addfightdetails(@RequestBody Itinerary itinerary) {
			itenar.adddetails(itinerary);
		}
		
		//Update flightdetails
		@PutMapping("/flights")
		public void updateFlightDetails(@RequestBody Itinerary itinerary) {
			itenar.adddetails(itinerary);
			
		}
		
		//Delete flightdetails
		@DeleteMapping("/flights/{theId}")
		public void deleteflightdetails(@PathVariable int theId) {
			itenar.deleteItenary(theId);
			
		}
		//list itenary
		@GetMapping("/flightitenary")
		public List<Itinerary> getdetails(){
			return itenar.showitenary();
	}
		//searchby flightid
		
		@GetMapping("/flights/{flightId}")
		public List<FlightDetailsDto> getdetailsbyid(@PathVariable int flightId ){
			return itenar.search(flightId);
			
		}
	
		
		
		
		
}
