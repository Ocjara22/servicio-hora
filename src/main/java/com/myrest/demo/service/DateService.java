package com.myrest.demo.service;

import com.myrest.demo.model.RequestUI;
import com.myrest.demo.model.ResponseUI;

public interface DateService {
	public ResponseUI getTimeUTC (RequestUI request);
}
