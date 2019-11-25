package com.accenture.lecture15;

import java.util.Arrays;

public class Weather {

	private final String country;
	private int[] daysWeather;

	// temperature information for next week (7 days).

	public Weather(String country, int[] daysWeather) {
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
		return "Weather forecast in " + this.country + " for next days"
				+ Arrays.toString(this.getDaysWeather());

	}

	public double getWeekAverage() {

		double average = getSum() / daysWeather.length;

		return average;

	}

	private double getSum() {
		double sum = 0;
		for (int i = 0; i < daysWeather.length; i++) {
			sum = sum + daysWeather[i];
		}

		return sum;

	}

	public int getHottestTemperature() {
		int max = daysWeather[0];
		for (int i = 0; i < daysWeather.length; i++) {
			if (max < daysWeather[i]) {
				max = daysWeather[i];
			}
		}
		return max;
	}

	public String getHottestDayName() {

		int hottestTemperature = daysWeather[0];
		int hottestDayIndex = 0;

		for (int i = 0; i < daysWeather.length; i++) {
			if (hottestTemperature < daysWeather[i]) {
				hottestTemperature = daysWeather[i];
				hottestDayIndex = i;
			}
		}
		String dayName;
		switch (hottestDayIndex) {
		case 0:
			dayName = "Monday";
			break;
		case 1:
			dayName = "Tuesday";
			break;
		case 2:
			dayName = "Wednesday";
			break;
		case 3:
			dayName = "Thursday";
			break;
		case 4:
			dayName = "Friday";
			break;
		case 5:
			dayName = "Saturday";
			break;
		case 6:
			dayName = "Sunday";
			break;
		default:
			dayName = "Invalid day";
			break;
		}

		return dayName;

	}

	public int getColdestTemperature() {
		int min = daysWeather[0];
		for (int i = 0; i < daysWeather.length; i++) {
			if (daysWeather[i] < daysWeather[0]) {
				min = daysWeather[i];
			}
		}
		return min;
	}

	public String getColdestDayName() {
		int coldestTemperature = daysWeather[0];
		int coldesttDayIndex = 0;

		for (int i = 0; i < daysWeather.length; i++) {
			if (daysWeather{i] < daysWeather[0]) {
				coldestTemperature = daysWeather[i];
				coldestDayIndex = i;
			}
		}
		String dayName;
		switch (coldesttDayIndex) {
		case 0:
			dayName = "Monday";
			break;
		case 1:
			dayName = "Tuesday";
			break;
		case 2:
			dayName = "Wednesday";
			break;
		case 3:
			dayName = "Thursday";
			break;
		case 4:
			dayName = "Friday";
			break;
		case 5:
			dayName = "Saturday";
			break;
		case 6:
			dayName = "Sunday";
			break;
		default:
			dayName = "Invalid day";
			break;
		}

		return dayName;

	}
		
		
		
	}
}
