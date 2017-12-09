package com.engreuso.api.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.engreuso.model.Profile;
import com.engreuso.model.User;
import com.engreuso.service.UserService;

@RestController
@RequestMapping("/customers")
public class UserRestController {

	@Autowired
	private UserService customerService;
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Iterable listAll() {
		return customerService.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public User save(@RequestBody User customer) {
		return customerService.save(customer);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public User get(@PathVariable("id") Long id) {
		return customerService.findOne(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody User update(@PathVariable("id") Long id, @RequestBody User customerUpdated) {
		return customerService.update(id, customerUpdated);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") Long id) {
		customerService.delete(id);
	}
	
	@RequestMapping(value = "/{id}/orders", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public User saveOrderByCustomerID(@PathVariable("id") Long id, @RequestBody Profile order) {
		return customerService.saveOrderByCustomerID(id, order);
	}
}