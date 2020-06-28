package com.myrest.demo.service;

import org.springframework.stereotype.Service;

import com.myrest.demo.model.RequestUI;
import com.myrest.demo.model.Response;
import com.myrest.demo.model.ResponseUI;

@Service
public class DateServiceImpl implements DateService{
	public ResponseUI getTimeUTC (RequestUI request) {
		ResponseUI response = new ResponseUI();
		
		Response res = new Response();
		
		res.setTime("hola");
		res.setTimezone("utc");
		
		response.setResponse(res);
		
		return response;
	}
}
