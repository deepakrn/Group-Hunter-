package com.example.listtest;

public class Group {
private String id;
private String name;
private String purpose;

public Group(String id, String name, String description) {
	super();
	this.id = id;
	this.name = name;
	this.purpose = description;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return purpose;
}
public void setDescription(String description) {
	this.purpose = description;
}
}
