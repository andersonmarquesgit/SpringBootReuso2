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
import com.engreuso.service.ProfileService;

@RestController
@RequestMapping("/profiles")
public class ProfileRestController {

	@Autowired
	private ProfileService profileService;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Iterable<Profile> listAll() {
		return profileService.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public Profile save(@RequestBody Profile profile) {
		return profileService.save(profile);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Profile get(@PathVariable("id") Long id) {
		return profileService.findOne(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody Profile update(@PathVariable("id") Long id, @RequestBody Profile profileUpdated) {
		return profileService.update(id, profileUpdated);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") Long id) {
		profileService.delete(id);
	}

}