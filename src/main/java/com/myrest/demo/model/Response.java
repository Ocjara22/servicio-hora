package com.myrest.demo.model;

public class Response {
	String time;
	String timezone;
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	@Override
	public String toString() {
		return "Response [time=" + time + ", timezone=" + timezone + "]";
	}
	
	
}
