package com.healthcare.module;

public class Patient {
	private int id;
	private String name;
	private int age;
	private String illness;
	public Patient(int i, String n, int a, String in) {
		this.id=i;
		this.name=n;
		this.age=a;
		this.illness=in;
	}
	public void setIllness(String illness){
		this.illness=illness;
	}
	public int getId(){
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getIllness() {
		return illness;
	}
}
