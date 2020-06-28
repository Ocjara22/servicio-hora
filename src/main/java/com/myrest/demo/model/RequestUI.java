package com.myrest.demo.model;

import java.util.Date;

import javax.validation.constraints.NotBlank;

public class RequestUI {
	
	@NotBlank(message = "{time.required}")
	private Date time;
	
	@NotBlank(message = "{timeZone.required}")
	private String timeZone;
}
