package SpringBootApplication.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import SpringBootApplication.bindings.Customer;
@RestController
public class CustomerRestController {
	@PutMapping(value="/update",consumes = { "application/json"} )

	public ResponseEntity<String>UpdateCustomer(@RequestBody     Customer customer) {
		System.out.println(customer);
		return new ResponseEntity<>("update succesfully",HttpStatus.OK);
		
	}
@DeleteMapping( value="/delete/{customerid}")
	public ResponseEntity<String>DeleteCustomer(    @PathVariable Integer customerid) {
		System.out.println(customerid);
		return new ResponseEntity<>("delete succesfully",HttpStatus.OK);
		
	}
}
