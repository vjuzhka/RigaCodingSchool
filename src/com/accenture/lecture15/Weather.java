package com.accenture.lecture15;

import java.util.Arrays;


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
	
public String toString() {
	return "Weather forecast in " + this.country + " for next days" + Arrays.toString(this.getDaysWeather());


}
}
