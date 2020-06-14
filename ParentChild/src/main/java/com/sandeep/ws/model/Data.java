package com.sandeep.ws.model;

public class Data {

	private int id;
	private int parentId;
	private String name;
	private String colour;

	public Data(int i, int j, String name, String colour) {
		super();
		this.id = i;
		this.parentId = j;
		this.name = name;
		this.colour = colour;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Data [id=" + id + ", parentId=" + parentId + ", name=" + name + ", colour=" + colour + "]";
	}

}
