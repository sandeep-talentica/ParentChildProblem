package com.sandeep.ws.model;

import java.util.ArrayList;
import java.util.List;

public class Output {

	public String name;
	public ArrayList<Output> subClass;
	
	
	public Output(String name) {
		this.name = name;
		subClass = new ArrayList<Output>();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public ArrayList<Output> getSubClass() {
		return subClass;
	}


	public void setSubClass(ArrayList<Output> subClass) {
		this.subClass = subClass;
	}

	

}
