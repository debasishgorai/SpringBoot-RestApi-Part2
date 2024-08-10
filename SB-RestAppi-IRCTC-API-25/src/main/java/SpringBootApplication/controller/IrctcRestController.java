package SpringBootApplication.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import SpringBootApplication.request.PassengerRequest;
import SpringBootApplication.ressponse.TicketResponse;
@RestController
public class IrctcRestController {

	@PostMapping(value="/booktickets",consumes = {"application/xml","application/json"},produces = {"application/xml","application/json"})
	
	
	
	public TicketResponse bookTickets( @RequestBody     PassengerRequest request) {
       TicketResponse response=new TicketResponse();
       response.setPrice(20000.00);
       response.setStatus("confirmed");
       BeanUtils.copyProperties(request, response);
		
		
		
		
		return response;
		
	}
}
