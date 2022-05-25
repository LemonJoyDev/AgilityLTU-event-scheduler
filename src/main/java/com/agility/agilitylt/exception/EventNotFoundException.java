package com.agility.agilitylt.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Event was not found")
public class EventNotFoundException extends RuntimeException {
}
