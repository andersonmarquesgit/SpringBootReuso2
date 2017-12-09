package com.engreuso.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No such Order")  // 404
public class ProfileNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 137744895179504666L;

	public ProfileNotFoundException(Long id) {
	}

}
