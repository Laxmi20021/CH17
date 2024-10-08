package com.xworkz.Somthing.dto;

import java.io.Serializable;
//marker interface
public class WeatherDTO implements Serializable{
	
	
	//mintemp,maxTemp,windSpeed,humidity,location
	
	private double minTemp;
	private double maxTemp;
	private int windSpeed;
	private int humidity;
	private String location;
	
	
	public double getMinTemp() {
		return minTemp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		return result;
	}



	@Override
	public String toString() {
		return "WeatherDTO [minTemp=" + minTemp + ", maxTemp=" + maxTemp + ", windSpeed=" + windSpeed + ", humidity="
				+ humidity + ", location=" + location + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WeatherDTO other = (WeatherDTO) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		return true;
	}



	public void setMinTemp(double minTemp) {
		this.minTemp = minTemp;
	}



	public double getMaxTemp() {
		return maxTemp;
	}



	public void setMaxTemp(double maxTemp) {
		this.maxTemp = maxTemp;
	}



	public int getWindSpeed() {
		return windSpeed;
	}



	public void setWindSpeed(int windSpeed) {
		this.windSpeed = windSpeed;
	}



	public int getHumidity() {
		return humidity;
	}



	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public WeatherDTO()
	{
		
	}

}
