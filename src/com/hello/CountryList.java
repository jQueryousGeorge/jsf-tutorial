package com.hello;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountryList {
	public static void main (String[] args) {
		// Get an array of two-letter country codes
		String[] countryCodes = Locale.getISOCountries();
		
		// Convert the array to a list for easy manipulation
		List<String> countries = new ArrayList<>();
		
		for (String countryCode : countryCodes) {
			
			// Create a local object for the specific country code
			Locale locale = new Locale.Builder()
					.setRegion(countryCode)
					.build();
			
			// Get the display name from the country code && add it to the list
			countries.add(locale.getDisplayCountry());
		}
		
		// Sort the list alphabetically
		Collections.sort(countries);
		
		System.out.println("List of countries:");
		for (String country : countries) {
			System.out.println(country);
		}
	}
}
