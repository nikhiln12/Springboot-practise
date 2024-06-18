package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

	private long alienId;
	private String alienName;
	private long mobileNumber;
	@Autowired
	private Laptop laptop;
	
	public long getAlienId() {
		return alienId;
	}
	public void setAlienId(long alienId) {
		this.alienId = alienId;
	}
	public String getAlienName() {
		return alienName;
	}
	public void setAlienName(String alienName) {
		this.alienName = alienName;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public void show() {
		System.out.println("welcome to aliens world..");
		laptop.compile();
	}
}
