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
@RequestMapping("/users")
public class UserRestController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Iterable listAll() {
		return userService.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public User save(@RequestBody User user) {
		return userService.save(user);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public User get(@PathVariable("id") Long id) {
		return userService.findOne(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody User update(@PathVariable("id") Long id, @RequestBody User userUpdated) {
		return userService.update(id, userUpdated);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") Long id) {
		userService.delete(id);
	}
	
}