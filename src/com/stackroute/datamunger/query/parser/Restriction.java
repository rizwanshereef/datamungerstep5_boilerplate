package com.stackroute.datamunger.query.parser;

/*
 * This class is used for storing name of field, condition and value for 
 * each conditions
 * */
public class Restriction {

	private String propertyName, propertyValue,condition;

	public String getPropertyName() {
		// TODO Auto-generated method stub
		return propertyName;
	}

	public String getPropertyValue() {
		// TODO Auto-generated method stub
		return propertyValue;
	}

	public String getCondition() {
		// TODO Auto-generated method stub
		return condition;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	@Override
	public String toString() {
		return "Restriction{" +
				"propertyName='" + propertyName + '\'' +
				", propertyValue='" + propertyValue + '\'' +
				", condition='" + condition + '\'' +
				'}';
	}

	public Restriction(String propertyName, String propertyValue, String condition) {
		this.propertyName = propertyName;
		this.propertyValue = propertyValue;
		this.condition = condition;
	}
}
