package com.accenture.lecture15;

import java.util.Arrays;

public class ObjectPractice {

	public static void main(String[] args) {

		// Task 4 - Lets create few weather forecasts for following countries:
		// Latvia,
		// Antaliya, Bergen
		// Example:
		Weather latvia = new Weather("Latvia", new int[] { -2, 0, 5, 2, 6, -1,
				0 });
		Weather turkey = new Weather("Turkey", new int[] { 15, 17, 13, 18, 14,
				17, 15 });
		Weather norway = new Weather("Norway", new int[] { -3, 0, -5, -7, -2,
				-4, -1 });

		// Task 5 - We should prohibit direct access to Weather object fields
		// Make fields private
		// Create getters for them
		// Output: Latvia [-2, 0, 5, 2, 6, -1, 0]
		System.out.println(latvia.getCountry() + " "
				+ Arrays.toString(latvia.getDaysWeather()));
		// Task 6 - User should be able to get weather information in
		// user-friendly way
		// Create toString method in Weather class
		// Output:
		// "Weather forecast in 'Latvia' for next days '-2, 0, 5, 2, 6, -1, 0'"
		System.out.println(latvia);

		// Send a link of your github repository to lecturer in slack
		// Wait until everyone will reach that point eiter ask for extra task
		// -------------------------------------------------------------------------------------

		// Task 7 - Create a method in class Weather which will return average
		// temperature for days
		// method signature: public double getWeekAverage()
		// Output: Average temperature in Latvia will be 1.8

		System.out.println("Average temperature in Latvia will be "
				+ latvia.getWeekAverage());

		// Task 8 - Create a method in class Weather which will return highest
		// temperature
		// Output: Highest temperature in Latvia will be 6
		System.out.println("Highest temperature in Latvia will be "
				+ latvia.getHottestTemperature());

		// Task 9 - Create a method in class Weather which will return hottest
		// day name, lets assume:
		// - first day of week is Monday
		// - there will be 7 days forecasts only
		// Use switch statement in order to solve it
		// Output: Hottest day in Latvia will be Friday
		System.out.println("Hottest day in Latvia will be " +
		latvia.getHottestDayName());

		// Task 10 - Create a method in class Weather which will return highest
		// temperature
		// Output: Lowest temperature in Latvia will be -2
		System.out.println("Lowest temperature in Latvia will be"
		+latvia.getColdestTemperature());

		// Task 11 - Create a method in class Weather which will return coldest
		// day name:
		// Output: Hottest day in Latvia will be Monday
		System.out.println("Hottest day in Latvia will be" +
	 latvia.getColdestDayName());

		// Task 12 - User wants to get advanced information printed out into
		// console about weather in specific country
		// Create method printAdvancedInformation() in Weather class
		// Output:
		// "In 'Latvia' during next 7 day will be following weather '-2, 0, 5,
		// 2, 6, -1, 0',
		// the highest temperature will be on Friday +6 degree,
		// the lowest temperature will be on Monday -2 degree"
		// latvia.printAdvancedInformation();

		// Task 13 - we need possibility to update weather temperature based on
		// coming warm cyclone, and increase weather temperature for each day by
		// one degree
		// create a public void applyWarmCycloneEffect()
		// Output:
		// "Weather forecast  in 'Latvia' for next days '-1, 1, 6, 3, 7, 0, 1'"
		// latvia.applyWarmCycloneEffect();
		// System.out.println(latvia);

	}

}
