package com.myrest.demo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myrest.demo.model.RequestUI;
import com.myrest.demo.service.DateService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class DateController {
	@Autowired
	private DateService service;
		
	@GetMapping("/date")
	public ResponseEntity<?> getDate(){
		return ResponseEntity.ok().body(new Date());
	}
	
	@PostMapping("/time-service")
	public ResponseEntity<?> getTimeService(@RequestBody RequestUI request){
		return ResponseEntity.ok().body(service.getTimeUTC(request));
	}
}
