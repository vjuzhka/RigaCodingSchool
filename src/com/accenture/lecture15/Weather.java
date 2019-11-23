package com.accenture.lecture15;

public class Weather {

	private final String country;
	private int[] daysWeather;
	// temperature information for next week (7 days).
	
	public Weather(String country , int[] daysWeather) {
		this.country = country;
		this.daysWeather = daysWeather;

				
	}

	public int[] getDaysWeather() {
		return daysWeather;
	}

	public void setDaysWeather(int[] daysWeather) {
		this.daysWeather = daysWeather;
	}

	public String getCountry() {
		return country;
	}
	

}
